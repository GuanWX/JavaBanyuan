package club.banyuan.TCP;

import java.io.IOException;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 4:09 下午
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Server()).start();
    }
}
