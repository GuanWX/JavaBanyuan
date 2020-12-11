package club.banyuan.Main;

import club.banyuan.Server.ServerSocket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:59 上午
 */
public class Server {
    public static void main(String[] args) {
        new Thread(new ServerSocket()).start();
    }
}
