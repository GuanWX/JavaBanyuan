package club.banyuan.Homework.homework_12_07;

import club.banyuan.Semaphore.Thread2;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 4:42 下午
 */
public class Print {
    public static boolean flag = false;
    public static void main(String[] args) {
        Object waitObject = new Object();
        Runnable runnable1 = new Runnable() {
            int key = 0;
            @Override
            public void run() {
                synchronized (waitObject){
                    if (!flag){
                        flag = true ;
                    }
                    while (key < 52) {
                        System.out.print(++key);
                        System.out.print(++key);
                        waitObject.notify();
                        try {
                            waitObject.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    waitObject.notifyAll();
                }
            }
        };
        Runnable runnable2 = new Runnable() {
            char c = 'A';
            @Override
            public void run() {
                synchronized (waitObject){
                    try {
                        if (!flag){
                            waitObject.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    while(c<='Z'){
                        System.out.print(c++ +"\t");
                        waitObject.notify();
                        try {
                            waitObject.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    waitObject.notifyAll();
                }
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }

}
