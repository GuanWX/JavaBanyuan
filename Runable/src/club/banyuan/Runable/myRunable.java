package club.banyuan.Runable;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 2:36 下午
 */
public class myRunable{
    public static void main(String[] args) {
        Runnable runnable = () ->{
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+i);
                Thread.yield();
            }
        };
        Thread thread1 = new Thread(runnable,"线程A");
        Thread thread2 = new Thread(runnable,"线程B");
        Thread thread3 = new Thread(runnable,"线程C");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
