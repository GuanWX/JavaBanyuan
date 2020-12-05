package club.banyuan.Homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 4:55 下午
 */
public class scanThread extends Thread{
    // 开启一个线程，接收键盘的输入，将输入的值，逐个字符依次输出到屏幕上，输出每个字符的时间间隔是500ms
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        for (char c :chars) {
            System.out.println(c);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
class TestMain{
    public static void main(String[] args) {
        scanThread scanThread = new scanThread();
        scanThread.start();
    }
}
