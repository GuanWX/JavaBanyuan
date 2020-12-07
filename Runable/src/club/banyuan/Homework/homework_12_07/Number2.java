package club.banyuan.Homework.homework_12_07;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 6:55 下午
 */
public class Number2 {
    final static Lock LOCK1 = new ReentrantLock();
    //    final static Lock LOCK2 = new ReentrantLock();
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
                    threadA.join();
                    threadB.join();
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
                    threadC.join();
                    threadD.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
