package club.banyuan.homework.rand;

import java.util.Random;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/26 7:23 下午
 */
public class RandomInt {
    public int  randomInt(int from,int to){
        Random random = new Random();
        return from+random.nextInt(to-from);
    }
}
class Main{
    public static void main(String[] args) {
        RandomInt randomInt = new RandomInt();
        for (int i = 0; i < 100; i++) {
            System.out.println(randomInt.randomInt(-10,5));
        }
    }
}
