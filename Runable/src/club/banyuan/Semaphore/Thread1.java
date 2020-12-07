package club.banyuan.Semaphore;

import java.util.concurrent.TimeUnit;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 2:18 下午
 */
public class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            if (Tool.SEMAPHORE1.tryAcquire(100, TimeUnit.MILLISECONDS)){
                System.out.println(Thread.currentThread().getName()+"得到了第1个锁");
                if (Tool.SEMAPHORE2.tryAcquire(200, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName()+"得到了第2个锁");
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
