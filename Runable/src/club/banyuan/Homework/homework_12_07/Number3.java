package club.banyuan.Homework.homework_12_07;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 8:08 下午
 */
public class Number3 {
    final static Semaphore semaphore1 = new Semaphore(1);
    final static Semaphore semaphore2 = new Semaphore(1);
    static CountDownLatch countDownLatch1 = new CountDownLatch(2);
    static CountDownLatch countDownLatch2 = new CountDownLatch(2);
    public static void main(String[] args) {
        Integer i = 0;
        ThreadMain1 threadMain1 = new ThreadMain1(i);
        ThreadMain2 threadMain2 = new ThreadMain2(i);
        threadMain1.start();
        threadMain2.start();
    }
}
class Thread1 extends Thread{
    Integer i;
    public Thread1(Integer i,String name) {
        super(name);
        this.i = i;
    }

    @Override
    public void run() {
        if(Number3.semaphore1.tryAcquire()){
            i ++;
            System.out.println(Thread.currentThread().getName() + " : "+ i);
            Number3.countDownLatch1.countDown();
            Number3.semaphore1.release();
        }
    }
}
class Thread2 extends Thread{
    Integer i;
    public Thread2(Integer i,String name) {
        super(name);
        this.i = i;
    }

    @Override
    public void run() {
        if(Number3.semaphore1.tryAcquire()){
            i --;
            System.out.println(Thread.currentThread().getName() + " : "+ i);
            Number3.countDownLatch2.countDown();
            Number3.semaphore1.release();
        }
    }
}
class ThreadMain1 extends Thread{
    Integer i;

    public ThreadMain1(Integer i) {
        this.i = i;
    }

    @Override
    public void run() {
        Thread1 thread1 = new Thread1(i,"A");
        Thread1 thread2 = new Thread1(i,"B");
        if(Number3.semaphore2.tryAcquire()){
            thread1.start();
            thread2.start();
            try {
                Number3.countDownLatch1.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadMain2 extends Thread{
    Integer i;
    public ThreadMain2(Integer i) {
        this.i = i;
    }
    @Override
    public void run() {
        Thread2 thread1 = new Thread2(i,"C");
        Thread2 thread2 = new Thread2(i,"D");
        if(Number3.semaphore2.tryAcquire()){
            thread1.start();
            thread2.start();
            try {
                Number3.countDownLatch2.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}