package club.banyuan.Homework.homework_12_07;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 6:55 下午
 */
public class Number2 {
    static CountDownLatch latch1 = new CountDownLatch(2);
    static CountDownLatch latch2 = new CountDownLatch(2);
    static int i = 0;
    public static void main(String[] args) {
        Object waitObject1 = new Object();
        Object waitObject2 = new Object();
        Runnable runnable1 = () -> {
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (waitObject2){
                i ++;
                System.out.println(Thread.currentThread().getName() + " : "+ i);
                latch1.countDown();
            }
        };
        Runnable runnable2 = () -> {
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (waitObject2){
                i --;
                System.out.println(Thread.currentThread().getName() + " : "+ i);
                latch2.countDown();
            }
        };
        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (waitObject1){
                Thread threadA = new Thread(runnable1, "A");
                Thread threadB = new Thread(runnable1, "B");
                threadA.start();
                threadB.start();
                try {
                    latch1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (waitObject1){
                Thread threadC = new Thread(runnable2, "C");
                Thread threadD = new Thread(runnable2, "D");
                threadC.start();
                threadD.start();
                try {
                    latch2.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
