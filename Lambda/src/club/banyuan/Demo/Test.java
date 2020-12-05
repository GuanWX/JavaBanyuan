package club.banyuan.Demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/3 5:25 下午
 */
public class Test {
    static Integer max(MyInter myInter,Integer a , Integer b){
        return myInter.max(a,b);
    }
    public static void main(String[] args) {
        Function<String,String> function = s -> s+s;
        System.out.println(function.apply("hi"));

        Consumer<Integer> consumer = integer -> System.out.println(integer);
        consumer.accept(19);

        Supplier<Integer> supplier = () -> 20;
        System.out.println(supplier.get());

        Predicate<Integer> predicate = integer -> integer>0;
        System.out.println(predicate.test(-1));

        System.out.println(max(Myclass::classMax, 20, 30));
    }
}
interface MyInter{
    Integer max(Integer a,Integer b);
}
class Myclass{
    static Integer classMax(Integer a, Integer b){
        System.out.println(a+""+b);
        return a>b? a: b;
    }
}