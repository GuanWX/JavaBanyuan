package club.banyuan.homework;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 5:40 下午
 */
public class CycleNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random()*50);
        Scanner scanner = new Scanner(System.in);
        int input_number;
        for(int i = 0; i < 5; i++){
            System.out.print("请输入数字");
            input_number = scanner.nextInt();
            if (number == input_number) {
                System.out.println("您猜对了");
                break;
            } else if (number < input_number) {
                System.out.println("您输入的数字太大了");
            } else if (number > input_number) {
                System.out.println("您输入的数字太小了");
            }
            if (4 == i) {
                System.out.println("5次机会已经用完了，您没有猜对，正确的数字是"+number);
            }
        }
    }
}
