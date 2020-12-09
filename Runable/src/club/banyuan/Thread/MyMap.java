package club.banyuan.Thread;

import club.banyuan.Semaphore.Thread2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/8 10:34 上午
 */
public class MyMap {
    public static void main(String[] args) {
        Map<String,String> map = new ConcurrentHashMap<String, String>();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    map.put(""+i,""+i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    map.put(""+i,""+i);
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int l =0;l <1000;l++){
            //如果key和value不同，说明两个线程在put的过程出现异常
            if(!String.valueOf(l).equals(map.get(String.valueOf(l)))){
                System.out.println(String.valueOf(l)+": "+map.get(String.valueOf(l)));
            }
        }

    }
}
