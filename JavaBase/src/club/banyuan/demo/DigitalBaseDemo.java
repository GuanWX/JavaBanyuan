package club.banyuan.demo;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/10上午9:34
 */
public class DigitalBaseDemo {
    public static void main(String[] args) {
        System.out.println(0B100); //4
        System.out.println(017); //15
        System.out.println(0x17); //23

        System.out.println(Integer.toOctalString(0b110_1101)); //155
        System.out.println(Integer.toHexString(0b110_1101)); //6D

        int num = 0b101101 + 0b11011;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));

    }
}
