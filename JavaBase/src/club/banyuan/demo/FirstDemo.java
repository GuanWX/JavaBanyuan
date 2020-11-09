package club.banyuan.demo;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/9下午7:18
 */

public class FirstDemo {
    public static void main(String[] args){
        System.out.println(true);
        System.out.println("ring");
        System.out.println('a');
        System.out.println(123.23);
        System.out.println(123);
        /*
        以上写法是字面量的写法
        */
        int num; //在内存中开辟一个（int）整形空间
        num = 12; //对存储空间进行赋值

        char ch = '男';//[男][\0] 涉及编码格式 utf-8 3个字节
        
        double dou1 = 12.1;
        double dou2 = 12.2d;//小数默认为double类型
        
        /*
        float flo1 = 12.3;
        报错 12.3 默认是double，不能直接将值赋给float
        */
        float flo2 = 12.4f;
        System.out.println("num的x:"+Integer.MAX_VALUE+" min:" + Integer.MIN_VALUE);

        String String = "String 不是关键字";
        /*
        * 除了基本数据类型，其他的都是引用数据类型
        * */

        System.out.println("0的二进制："+Integer.toBinaryString('0'));
        ch = '0';
        System.out.println(ch+1);
        System.out.println(ch+'1');
    }
}
