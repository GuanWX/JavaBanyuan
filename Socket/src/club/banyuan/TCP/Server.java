package club.banyuan.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 3:52 下午
 */
public class Server implements Runnable{
    @Override
    public void run() {
        try {
            ServerSocket serverSocket= new ServerSocket(10000);
            Socket socket = serverSocket.accept();
            System.out.println("连接机器"+socket.getInetAddress().getHostAddress());
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String s ;
            while ((s = reader.readLine())!=null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
