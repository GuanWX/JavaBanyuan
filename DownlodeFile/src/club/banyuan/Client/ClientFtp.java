package club.banyuan.Client;


import club.banyuan.Server.ServerSocket;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:49 上午
 */
public class ClientFtp implements Runnable{
    String path;
    static java.net.ServerSocket serverSocket;
    static {
        try {
            serverSocket = new java.net.ServerSocket(19002);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ClientFtp() {
    }

    public ClientFtp(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("ClientFtp open");
        try {
            Socket socket = serverSocket.accept();
            File file = new File(path);
            if (!file.exists()){
                if (!file.createNewFile()){
                    System.out.println(path+"创建失败");
                }
            }
            InputStream socketIn = socket.getInputStream();
            OutputStream outputStream = new FileOutputStream(file);
            List<Byte> bytes = new ArrayList<>();
            int c;
            while ((c=socketIn.read())!=-1){
                outputStream.write((byte)c);
            }
            outputStream.close();
            new Thread(new ClientSocket()).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
