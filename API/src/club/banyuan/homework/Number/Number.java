package club.banyuan.homework.Number;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/27 9:11 上午
 */
public class Number {
    static int [] res=new int[4];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        produce();
        System.out.println(Arrays.toString(res));
        while (!compare(inputNum()));
    }
    public static void produce(){
        Random random = new Random();
        int temp;
        for (int i = 0; i < 4; i++) {
            do {
                temp= random.nextInt(10);
            }
            while(!check(res,temp,i));
            res[i]=temp;
        }
    }

    private static boolean check(int[] res, int number, int index) {
        for (int i = 0; i < index; i++) {
            if (number==res[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean compare(int[] input){
        int count1=0,count2=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (input[i]==res[j]){
                    count1++;
                    if (i==j){
                        count2++;
                    }
                }
            }
        }
        if (count1== res.length&&count2== res.length){
            System.out.println("回答正确");
            return true;
        }
        System.out.println("包含了"+count1+"个正确的数字");
        System.out.println(count2+"个数字位置正确");
        return false;
    }
    public static int[] inputNum(){
        int[] input = new int[4];
        boolean flag;
        System.out.println("请输入4个数字：");
        do{
            flag = true;
            String inputNum=scanner.next();
            char [] temp = inputNum.toCharArray();
            if (temp.length!=4){
                System.out.println("输入的数字不合法，输入4个不重复的数字");
                flag=false;
                continue;
            }
            for (int i = 0; i < 4; i++) {
                if(!check(input,(int)(temp[i]-48),i)){
                    System.out.println("输入的数字不合法，输入4个不重复的数字");
                    flag=false;
                    break;
                }else {
                    input[i]=temp[i]-48;
                }
            }
        }while (!flag);
        return input;
    }
}
