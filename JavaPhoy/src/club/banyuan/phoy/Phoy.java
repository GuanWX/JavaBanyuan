package club.banyuan.phoy;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 2:26 下午
 */
public class Phoy {
    /**
     * 多态：
     * 1、有继承，2、方法重写 3、父类引用指向子类对象
     *
     * 2.多态成员访问特点
     *         成员变量：
     *          在多态的情况下，如果子类变量名和父类变量名重名，使用父类的变量
     *         成员方法：
     *          发生方法重写的情况下，父类变量名引用的方法名使用的是子类的方法
     *         静态方法：
     *          如果父类引用指向子类对象，那么父类和子类的相同的静态方法名被调用，执行的是父类的静态方法（由此侧面验证 静态方法不能被重写）
     *
     * 弊端：如果子类有自己的行为或者属性，那么父类就不能直接使用
     *
     * */
    static void me(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Phoy.me();
        Phoy phoy = new Phoy();

    }
}