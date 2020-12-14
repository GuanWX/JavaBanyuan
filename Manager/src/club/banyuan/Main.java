package club.banyuan;

import club.banyuan.Tool.Config;
import club.banyuan.http.Server;

import java.util.concurrent.Executors;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 10:36 上午
 */
public class Main {
    public static void main(String[] args) {
        new Config();
        new Thread(new Server()).start();
    }
}
