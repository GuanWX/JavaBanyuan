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
        int num3 = 11;
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

        /*
        * <<  无符号左移，后面添加0
        * >>  无符号右移，正数前面添加0，负数前面添加1
        * >>> 有符号右移，无论正负前面添加0，
        * */

        System.out.println("-7<<2="+(-7<<2));
        /*
        * 1000 0111 -7的源码
        * 1111 1000 -7的反码
        * 1111 1001 -7的补码
        *
        * 1110 0100 移位结果的补码
        * 1110 0101 移位结果的反码
        * 1001 1010 移位结果的源码 -28
        * */

        System.out.println("-7>>2=" + (-7 >> 2));
        /*
        * 1000 0111 -7的源码
        * 1111 1000 -7的反码
        * 1111 1001 -7的补码
        *
        * 1111 1110
        * 1000 0001
        * 1000 0010
        * */

        System.out.println("-1610612735>>1=" + (-1610612735 >> 1));
        /*
        * 1101 1111 1111 1111 1111 1111 1111 1111
        * 1010 0000 0000 0000 0000 0000 0000 0000
        * 1010 0000 0000 0000 0000 0000 0000 0001
        *
        * 1101 0000 0000 0000 0000 0000 0000 0000
        * 1010 1111 1111 1111 1111 1111 1111 1111
        * 1011 0000 0000 0000 0000 0000 0000 0000
        * */

        System.out.println("-7>>>2=" + (-7 >>> 2));
        /*
        * 1000 0000 0000 0000 0000 0000 0000 0111 -7的源码
        * 1111 1111 1111 1111 1111 1111 1111 1000 -7的反码
        * 1111 1111 1111 1111 1111 1111 1111 1001 -7的补码
        *
        * 0011 1111 1111 1111 1111 1111 1111 1110 移位的结果
        * */

        System.out.println( (num1 > num2 ? num1 : num2)>num3 ? (num1 > num2 ? num1 : num2):num3);
    }
}
