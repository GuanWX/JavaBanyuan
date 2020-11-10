package club.banyuan.homework;

import java.util.Scanner;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/10 下午3:57
 */
public class homework_11_10 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please input month:");
        int month = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please input day:");
        int day = scanner2.nextInt();
        ountDay(2020,month,day);

        System.out.println("-------------------");
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Please input year:");
        int year = scanner3.nextInt();
        System.out.print("Please input month:");
        month = scanner1.nextInt();
        System.out.print("Please input day:");
        day = scanner2.nextInt();
        CountDay(year,month,day);
    }

    private static void CountDay(int year, int month, int day){
        int month_bak = month;
        int day_number = 0;
        int day_Feb = 28;
        if (((0 == year % 4) && (0 != year % 100)) || (0 == year % 400)) {
            System.out.println(year+"年是闰年");
            day_Feb = 29;
        }else{
            System.out.println(year+"年不是闰年");
        }
        int day_sum=day;
        while( month<=12&&month>0) {
            month--;
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day_number = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day_number= 30;
                    break;
                case 2:
                    day_number = day_Feb;
                    break;
                default:
                    day_number = 0;
                    break;
            }
            day_sum+=day_number;
        }
        System.out.println(month_bak+"月"+day+"是"+year+"年的第"+day_sum+"天");
    }

}
