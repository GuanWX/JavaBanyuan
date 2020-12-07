package club.banyuan.Lock;

import club.banyuan.Runable.MyThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 11:06 上午
 */
public class MyLock {
    Lock lock = new ReentrantLock();
    public void TestLock(){
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"获取了锁");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
    public void TestLockNotWait(){
        boolean b;
        try {
            b = lock.tryLock(1000,TimeUnit.MILLISECONDS);
            if (b){
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+"获取了锁");
                lock.unlock();
            }else {
                System.out.println(Thread.currentThread().getName()+"没有获取了锁");
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
    }
}

class TestLock {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                myLock.TestLockNotWait();
            }
        }, "A");
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                myLock.TestLock();
            }
        }, "B");
        threadA.start();
        threadB.start();
    }
}