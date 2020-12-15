package club.banyuan.http;

import club.banyuan.Tool.Config;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 2:14 下午
 */
public class Server implements Runnable {
    @Override
    public void run() {
        try {
            ServerSocket serverSocket = new ServerSocket(Config.Port);
            System.out.println("Server open...");
            ExecutorService pool = Executors.newFixedThreadPool(3);
            while (true){
                Socket accept = serverSocket.accept();
                pool.submit(new ServerRes(accept));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
