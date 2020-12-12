package club.banyuan.http;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 2:14 下午
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(19001);
            while (true){
                Socket accept = serverSocket.accept();
                final Thread thread = new Thread(new ServerImp(accept));
                thread.start();
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                accept.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class ServerImp implements Runnable{
    Socket socket;
    public ServerImp() {
    }

    public ServerImp(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = reader.readLine().split(" ")[1];
            File file = new File("/Users/edz/Desktop/banyuan/git/java-banyuan/Socket"+s);
            FileInputStream fileInputStream =new FileInputStream(file);
            DataOutputStream Out = new DataOutputStream(socket.getOutputStream());
            if (file.exists()){
                Out.writeBytes("HTTP/1.1 200 ok\n");
                Out.writeBytes("Content-Length: "+fileInputStream.available()+"\n");
                /**
                 * 此处的url中包含了html  和css  的一些静态的资源
                 *    但是静态资源在前端页面的渲染方式又不一样  所以在这里做个判断
                 */
                if (s.endsWith(".html")) {
                    Out.writeBytes("Content-Type: text/html; charset=utf-8;\n");
                } else if (s.endsWith(".css")) {
                    Out.writeBytes("Content-Type: text/css; charset=utf-8;\n");
                }
                //使用换行符对响应头和文件数据进行分开  不然文件数据没法显示在页面上
                Out.writeBytes("\n");
                Out.write(fileInputStream.readAllBytes());
                Out.flush();
                socket.shutdownOutput();
            }else {
                Out.writeBytes("HTTP/1.1 404 ok\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}