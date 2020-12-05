package club.banyuan.Demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 10:16 上午
 */
public class Stream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(123, 234, 345, 456, 465, 678, 789);
        integers.stream().limit(3).forEach(System.out::println);
        System.out.println("-----");
        integers.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }).forEach(System.out::println);
    }
}
