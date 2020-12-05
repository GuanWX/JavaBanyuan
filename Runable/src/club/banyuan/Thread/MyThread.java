package club.banyuan.Thread;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 2:31 下午
 */
public class MyThread extends Thread{
    public MyThread(String str) {
        this.setName(str);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+i);
        }
    }
}
class Test{
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("线程A");
        MyThread myThread2 = new MyThread("线程B");
        MyThread myThread3 = new MyThread("线程C");

        myThread1.start();
        myThread2.start();
        myThread3.start();

    }
}
