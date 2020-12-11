package club.banyuan.Demo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 2:30 下午
 */
public class UDPReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            String s ;
            byte[] bytes;
            DatagramSocket datagramSocket;
            while(true){
                datagramSocket = new DatagramSocket();
                s = scanner.nextLine();
                bytes= s.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,InetAddress.getLocalHost(),10086);
                datagramSocket.send(datagramPacket);
                datagramSocket.close();
                bytes=null;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
