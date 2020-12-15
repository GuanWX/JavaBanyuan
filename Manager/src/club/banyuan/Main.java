package club.banyuan;

import club.banyuan.Tool.Config;
import club.banyuan.Tool.UserOnLine;
import club.banyuan.UserServer.UserServer;
import club.banyuan.http.Server;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 10:36 上午
 */
public class Main {
    public static void main(String[] args) {
        new Config();
        new UserServer();
        new UserOnLine();
        new Thread(new Server()).start();
    }
}
