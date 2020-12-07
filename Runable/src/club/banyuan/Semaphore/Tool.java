package club.banyuan.Semaphore;

import java.util.concurrent.Semaphore;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 2:17 下午
 */
public class Tool {
    public static final Semaphore SEMAPHORE1 = new Semaphore(1);
    public static final Semaphore SEMAPHORE2 = new Semaphore(1);

    public static void main(String[] args) {
        new Thread(new Thread1(),"进程A").start();
        new Thread(new Thread2(),"进程B").start();
    }
}
