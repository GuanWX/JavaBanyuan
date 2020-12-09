package club.banyuan.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/8 11:16 上午
 */
public class testPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            int num = i;
            executorService.submit(()-> System.out.println(Thread.currentThread().getName()+ " " +num));
        }
        executorService.shutdown();
        System.out.println();
        ExecutorService pool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 100; i++) {
            int num = i;
            pool.submit(()-> System.out.println(Thread.currentThread().getName()+ " " +num));
        }
        pool.shutdown();
        ScheduledExecutorService pool2 = Executors.newScheduledThreadPool(3);
        pool2.schedule(() -> System.out.println(Thread.currentThread().getName()),1, TimeUnit.SECONDS);
        pool2.schedule(() -> System.out.println(Thread.currentThread().getName()),5, TimeUnit.SECONDS);
        pool2.shutdown();
    }
}
