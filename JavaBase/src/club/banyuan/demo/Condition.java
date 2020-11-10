package club.banyuan.demo;

import java.util.Scanner;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/10 下午2:57
 */
public class Condition {
    public static void main(String[] args) {
        int num1 = 12, num2 = 13;
        if (num1 > num2) {
            System.out.println("num1>num2");
        } else {
            System.out.println("num1<=num2");
        }


        if (num1 > 10) {
            System.out.println("num1>10");
        } else if (num1 < 10) {
            System.out.println("num1<10");
        } else {
            System.out.println("num1=10");
        }

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please input age:");
        int age = scanner.nextInt();
        System.out.println("Age:"+age);
      */

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please input a month:");
        int month = scanner1.nextInt();
        if (12 == month | 1 == month | 2 == month) {
            System.out.println("Winter");
        } else if (2 == month | 3 == month | 4 == month) {
            System.out.println("Spring");
        } else if (5 == month | 6 == month | 7 == month) {
            System.out.println("Summer");
        } else if (8 == month | 9 == month | 10 == month) {
            System.out.println("Autumn");
        } else {
            System.out.println("Your input isn't a month!");
        }

        switch (month){ // 整形 字符串 字符类型 从jdk1.5以后可以是枚举类型
            case 11:
            case 12:
            case 1:
                System.out.println("Winter");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Spring");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Summer");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Your input isn't a month!");
        }


    }
}
