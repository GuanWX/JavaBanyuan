package club.banyuan.Runable;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 3:45 下午
 */
public class MyThread {
    private static Thread thread;

    public MyThread() {
    }

    public MyThread(Thread thread) {
        this.thread = thread;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = ()->{
            System.out.println(Thread.currentThread().getName()+"状态:"+Thread.currentThread().getState());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName()+"状态："+thread.getState());
        };

        MyThread myThread = new MyThread(Thread.currentThread());

        Thread thread1 = new Thread(runnable1,"自定义线程A");
        System.out.println("自定义线程A未运行状态："+thread1.getState());

        thread1.start();
        thread1.join();

        System.out.println("主函数线程状态："+thread.getState());
        try{
            thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getName()+"状态："+thread1.getState());

    }
}
