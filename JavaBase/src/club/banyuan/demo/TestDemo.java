package club.banyuan.demo;

import java.util.Scanner;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/13 下午2:19
 */
public class TestDemo {
    public static int method(){
        Scanner scanner = new Scanner(System.in);
        int age ;
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            age = a/b;
            return age;
        }catch (Exception e){
            e.printStackTrace();
            age =2;
            return age;
        }finally {
            age = 3;
            //return age;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
