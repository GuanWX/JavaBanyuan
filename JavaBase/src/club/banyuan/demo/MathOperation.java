package club.banyuan.demo;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/10上午9:59
 */
public class MathOperation {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 13;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);

        double dou = 48.36;
        System.out.println(num1 * dou);
        System.out.println(num1 / dou);
        System.out.println(dou / num1);
        System.out.println(dou / -num1);
        System.out.println(-dou / num1);

        System.out.println("1+1="+(1+1)); //1+1=2
        System.out.println("1+1="+1+1); //  1+1=11
        System.out.println(1+1+"=1+1"); //  2=1+1
        System.out.println((1)+"=1+1"); //2=1+1

        System.out.println(dou %num1);

        System.out.println(SumPosition(1234));

        System.out.println("num1="+num1);
        System.out.println("num1++="+(num1++));
        System.out.println("++num1="+(++num1));

        int x = 2;
        System.out.println("x="+x);
        x = x++ + --x + x-- + ++x;
        System.out.println("x++ + --x + x-- + ++x = "+x);//4*x=8
    }

    private static int SumPosition (int num){
        int sum = 0;
        while (0 != num){
            sum = sum + num%10;
            num = num / 10;
        }
        return sum;
    }
}
