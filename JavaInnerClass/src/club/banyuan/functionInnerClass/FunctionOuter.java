package club.banyuan.functionInnerClass;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 3:16 下午
 */
public class FunctionOuter {
    private static int s= 100;
    private int s1 = 20;
    public void print(final int param) {
        final int in = 300;
        // 方法内部类只能是默认的权限 public等都不能修饰方法内部类
        class FunctionInner{
            public void innertest() {
                //不能创建静态的变量和方法，可以访问外部类的静态变量和方法，可以访问外部的
                System.out.println("FunctionInner：s="+s);
                System.out.println("FunctionInner：s1="+s1);
                System.out.println("FunctionInner：in="+ in);
                test();
            }
        }
        FunctionInner fi = new FunctionInner();
        fi.innertest();
        System.out.println("print:in"+in);
    }
    public void test() {
        System.out.println("FunctionOuter："+s);
    }
    public static void main(String[] args) {
        FunctionOuter fo = new FunctionOuter();
        fo.print(900);
    }
}
