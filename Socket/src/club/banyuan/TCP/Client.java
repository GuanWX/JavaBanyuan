package club.banyuan.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 3:52 下午
 */
public class Client implements Runnable{
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String s;
        try {
            Socket socket = new Socket("192.168.10.232",10000);
            OutputStream outputStream = socket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            while(true){
                System.out.println("请输出发送的内容：");
                s= scanner.nextLine();
                writer.write(s);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
