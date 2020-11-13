package club.banyuan.homework;

import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/11 9:52 下午
 */
public class homework_11_11_2 {
    /*
    * 定义一个全局的数组定义数据,
    * */
    static double[][] arr ={
            {1,0,49.5},
            {1.3,50,59.5},
            {1.7,60,64.5},
            {2,65,69.5},
            {2.3,70,74.5},
            {2.7,75,79.5},
            {3.0,80,84.5},
            {3.3,85,89.5},
            {3.7,90,94.5},
            {4.0,95,99.5},
            {4.7,100,104.5},
            {5.0,105,120}
    };
    public static void main(String[] args) {

        printGradeTable();
        System.out.println(70+"的等级得分是"+getGrade(70));
        isPass(120);

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字节数：");
        long bytes = scanner.nextLong();
        String str = formateByte(bytes);
        System.out.println(str);

    }
    static void printGradeTable(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("等级得分："+arr[i][0]+" 是从 "+arr[i][1]+" 分到 "+arr[i][2]+"分");
        }
    }

    static double getGrade(double point){
        double re =0 ;
        for (int i = 0; i <arr.length ; i++) {
            if (point >= arr[i][1] && point <= arr[i][2]) {
                return arr[i][0];
            }
        }
        return re;
    }

    static boolean isPass(double point){
        boolean flag = false;
        double res = getGrade(point);
        System.out.println(point+"的等级得分是"+res);
        if (res > 2.0) {
            flag = true;
        }

        double po =0;
        while (po<=120) {
            System.out.println(po+"的等级得分是"+getGrade(po));
            po+=0.5;
        }
        return flag;
    }

    static String formateByte(long bytes){
        String[] strs= {"B","KB","MB","GB","TB"};
        double res = bytes;
        int index = 0;
        while (index < strs.length-1 && res > 1000) {
            res = res/1000;
            index++;
        }
        return res+strs[index];
    }
}
