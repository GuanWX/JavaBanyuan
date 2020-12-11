package club.banyuan.Demo;

import java.io.IOException;
import java.net.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 2:29 下午
 */
public class UDPSend {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket;
            byte[] bytes = new byte[1024];
            while(true){
                datagramSocket = new DatagramSocket(10086);
                DatagramPacket datagramPacket = new DatagramPacket(bytes,1024);
                datagramSocket.receive(datagramPacket);
                System.out.println(new String(bytes));
                datagramSocket.close();
                bytes = new byte[1024];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
