package club.banyuan.Demo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 2:31 下午
 */
public class InnerClass {
    public class Inner{

    }
}
class Test{
    public static void main(String[] args) {
        new InnerClass().new Inner();
    }
}
