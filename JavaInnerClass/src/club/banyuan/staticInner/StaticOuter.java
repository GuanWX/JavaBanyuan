package club.banyuan.staticInner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 2:43 下午
 */

/**
 * 静态内部类只能访问外部类的静态变量和方法,可以自己的静态变量和静态方法
 * */
public class StaticOuter {
    private static int shared = 100;
    public static class StaticInner{
        static int i =20;
        public void staticInnerMethod() {
            System.out.println("Static Inner Method" + shared +i);
        }
    }
    StaticInner si1 = new StaticInner();
    public void test() {
        StaticInner si = new StaticInner();
        si.staticInnerMethod();
    }
    public static void main(String[] args) {
        StaticOuter so = new StaticOuter();
        so.test();
        //在外部类范围内
        StaticInner si1 = new StaticInner();
        si1.staticInnerMethod();
        //合法
        StaticOuter.StaticInner si2 = new StaticOuter.StaticInner();
        si2.staticInnerMethod();
    }
}
class Test{
    public static void main(String[] args) {
        StaticOuter.StaticInner staticInner  = new StaticOuter.StaticInner();
        staticInner.staticInnerMethod();
    }
}
