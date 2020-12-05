package club.banyuan.Set.Number;

import java.util.Random;
import java.util.TreeSet;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/3 10:36 上午
 */
public class RandomNumber {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        Random random = new Random();
        while (treeSet.size()<=10){
            treeSet.add(random.nextInt(20)+1);
        }
        System.out.println(treeSet);
    }
}
