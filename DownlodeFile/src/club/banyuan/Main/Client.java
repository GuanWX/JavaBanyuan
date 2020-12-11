package club.banyuan.Main;

import club.banyuan.Client.ClientSocket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:55 上午
 */
public class Client {
    public static void main(String[] args) {
        new Thread(new ClientSocket()).start();
    }
}
