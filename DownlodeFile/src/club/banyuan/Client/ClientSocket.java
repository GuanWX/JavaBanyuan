package club.banyuan.Client;

import club.banyuan.Server.ServerFtp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:28 上午
 */
public class ClientSocket implements Runnable{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String s;
        try {
            Socket socket = new Socket("192.168.10.232",8080);

            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((s = reader.readLine())!=null){
                System.out.println(s);
            }
            System.out.println("请输入下载的文件名：");
            s= scanner.nextLine();
            writer.write(s);
            writer.newLine();
            new Thread(new ClientFtp("/Users/edz/Desktop/接受/"+s)).start();
            writer.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
