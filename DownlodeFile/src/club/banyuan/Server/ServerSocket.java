package club.banyuan.Server;


import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:26 上午
 */
public class ServerSocket implements Runnable{
    static java.net.ServerSocket serverSocket;

    static {
        try {
            serverSocket = new java.net.ServerSocket(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        try {

            Socket socket = serverSocket.accept();
            System.out.println("连接机器"+socket.getInetAddress().getHostAddress());

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s ;
            ArrayList<String> ls = new Ls().ls("/Users/edz/Pictures/idea背景图");
            for (String s1 :ls) {
                writer.write(s1);
                writer.newLine();
            }
            writer.flush();
            socket.shutdownOutput();
            while ((s = reader.readLine())!=null){
                System.out.println(s);
                new Thread(new ServerFtp("/Users/edz/Pictures/idea背景图/"+s)).start();
                break;
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
