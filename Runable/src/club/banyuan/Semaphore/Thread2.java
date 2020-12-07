package club.banyuan.Semaphore;

import java.util.concurrent.TimeUnit;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 2:24 下午
 */
public class Thread2 implements Runnable{
    @Override
    public void run() {
        try {
            if (Tool.SEMAPHORE2.tryAcquire(300, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+"得到了第2个锁");
                if (Tool.SEMAPHORE1.tryAcquire(200, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName()+"得到了第1个锁");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Tool.SEMAPHORE1.release();
            Tool.SEMAPHORE2.release();
        }
    }
}
