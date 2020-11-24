package club.banyuan.memberInner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 2:56 下午
 */
public class OriginalClass {
    private static int t1 = 100;
    private int t2 = 200;
    class OriginalInner{
//        不合法的表示，在成员内部类中不可以定义静态的变量和方法
//        public static int inner = 100;
//        public static void print() {
//        }

//      合法的final变量
        public static final int t1 = 300;

        public void test() {
//            成员内部类的非静态方法可以访问外部类的静态变量和非静态变量

            System.out.println("OriginalInner:"+ t1);//直接访问外部类静态变量
            System.out.println("OriginalInner:"+ t2);//直接访问外部类成员变量
            action();//直接访问外部类方法
            System.out.println("OriginalInner:"+ OriginalClass.t1);//
            System.out.println("OriginalInner:"+ OriginalClass.this.t2);
            OriginalClass.this.action();
        }
    }
    public void action() {
        System.out.println("originalinner action");
    }
    public static void main(String[] args) {
        //new一个内部类
        OriginalClass oc = new OriginalClass();
        OriginalInner oi = oc.new OriginalInner();
        oi.test();
    }
}
class Test{
    public static void main(String[] args) {
        OriginalClass.OriginalInner originalInner = new OriginalClass().new OriginalInner();
        originalInner.test();
    }
}
