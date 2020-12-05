package club.banyuan.Homework.homework2;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedCounter {
  static int counter = 0;


  public static void reset() {
    counter = 0;
  }

  public static int increment(int numThreads, int numIncrementsPerThread) throws InterruptedException {
    Thread[] threads = new Thread[numThreads];
    // CountDownLatch 作为计数器，当计数器归零后完成执行
    CountDownLatch latch = new CountDownLatch(numThreads);
    // lambda 表达式重写Runnable 接口
    Runnable runnable = ()->{
      // 创建一个锁对象
      Object waitObject = new Object();
      // 随机休眠，测试是否等待全部线程执行完成后再 return
//      Random random = new Random();
//      try {
//        Thread.currentThread().sleep(random.nextInt(1000));
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }

      synchronized (waitObject){
        counter+=numIncrementsPerThread;
        // 执行完任务后，计数器减一
        latch.countDown();
      }

    };
    // 创建 numThreads 个线程
    for (int i = 0; i < numThreads; i++) {
      threads[i]  = new Thread(runnable);
      threads[i].start();
    }
    // 等待计数器归零
    try{
      latch.await();
    }catch (InterruptedException e){
      e.printStackTrace();
    }
    return counter;
  }
}
class Main{
  public static void main(String[] args) {
    try {
      System.out.println(SharedCounter.increment(100, 10));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
