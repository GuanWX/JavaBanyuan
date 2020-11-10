package club.banyuan.demo;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/10上午10:56
 */

public class ComperOperation {
    public static void main(String[] args) {
        /*
        *比较运算符
      * */
        int num1 = 12;
        int num2 = 13;
        double dou1 = 14;
        System.out.println(num1>num2);
        System.out.println(num1>=num2);
        System.out.println(num1<num2);
        System.out.println(num1<=num2);
        System.out.println(num1==num2);
        System.out.println(num1!=num2);
        System.out.println(dou1>=num2);

        /*
        * & 与       无论左边是否成立，右边继续执行
        * && 短路与   左边一旦不成立，将整个表达式判定为false，右边不再执行
        * | 或       无论左边是否成立，右边继续执行
        * || 短路或   左边一旦成立，将整个表达式判定为true，右边不再执行
        * ^ 异或
        * */
        System.out.println(">>>>>>>>>>逻辑运算符>>>>>>>>>");
        System.out.println(">>>>>>>>>> &  >>>>>>>>");
        System.out.println("num1=" + num1);
        System.out.println("num1>num2 & num1++<num2=" + (num1>num2 & num1++<num2));
        System.out.println("num1=" + num1);

        System.out.println(">>>>>>>>>> && >>>>>>>>");
        num1=12;
        System.out.println("num1=" + num1);
        System.out.println("num1>num2 && num1++<num2=" + (num1>num2 && num1++<num2) );
        System.out.println("num1=" + num1);

        System.out.println(">>>>>>>>>> |  >>>>>>>>");
        System.out.println("num1=" + num1);
        System.out.println("num1<num2 | num1++<num2=" + (num1<num2 | num1++<num2));
        System.out.println("num1=" + num1);

        System.out.println(">>>>>>>>>> || >>>>>>>>");
        num1=12;
        System.out.println("num1=" + num1);
        System.out.println("num1<num2 || num1++<num2=" + (num1<num2 || num1++<num2) );
        System.out.println("num1=" + num1);

        System.out.println(">>>>>>>>>> ^ >>>>>>>>");
        System.out.println("true^false="+(true^false));
        System.out.println("false^false="+(false^false));
        System.out.println("true^true="+(true^true));

    }
}
