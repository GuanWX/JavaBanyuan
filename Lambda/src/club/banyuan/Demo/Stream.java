package club.banyuan.Demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/4 10:16 上午
 */
public class Stream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(123, 234, 345, 456, 465, 678, 789);
        // limit(3) 选取前三个进行操作
        integers.stream().limit(3).forEach(System.out::println);
        System.out.println("-----");

        // 输出 integer 的排序结果（从大到小）
        integers.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }).forEach(System.out::println);
        System.out.println("-----");
        // lambda 表达式 实现排序（从小到大）
        integers.stream().sorted(((o1, o2) -> o1 - o2)).forEach(System.out::println);
        System.out.println("-----");
        // filter() 筛选符合条件数据 .collect(Collectors.[function]) 集合操作
        List<Integer> collect = integers.stream().filter((a) -> a > 500).collect(Collectors.toList());
        System.out.println(collect);
        // allMatch() anyMatch() 全部符合条件 是否存在值符合条件
        System.out.println(integers.stream().allMatch((x) -> x > 500));
        System.out.println(integers.stream().anyMatch((x) -> x > 500));
        List<String> strings = Arrays.asList(new String[]{"I", "Love", "you"});
        // 字符串拼接
        String collect1 = strings.stream().collect(Collectors.joining(","));
        System.out.println(collect1);

        // 输出x^2
        integers.stream().map(x -> x* x).forEach(System.out::println);
        // 统计 integer 的数学特征；
        IntSummaryStatistics intSummaryStatistics = integers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());

    }
}
