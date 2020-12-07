package club.banyuan.Homework.homework_12_07;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/7 4:42 下午
 */
public class Print {
    public static void main(String[] args) {
        Object waitObject = new Object();
        Runnable runnable1 = new Runnable() {
            int key = 0;
            @Override
            public void run() {
                synchronized (waitObject){
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
                        waitObject.wait();
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
        thread2.start();
        thread1.start();
    }

}
