package club.banyuan.TCP;

import java.io.IOException;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/10 4:08 下午
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        new Thread(new Client()).start();
    }
}
