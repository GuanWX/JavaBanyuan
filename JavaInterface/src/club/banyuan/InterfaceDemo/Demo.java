package club.banyuan.InterfaceDemo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 11:10 上午
 */
public interface Demo {
    /**
     * 接口作为一种开发的规范而存在
     *      在并不破坏原有代码的基础上添加额外的功能
     *
     *      在反射中实现
     *      接口不能实例化
     *      接口里面的是抽象方法访问权限默认为public 也只能是public 接口的方法是抽象方法，也只能抽象方法
     *      接口里面的变量全部是是静态常亮 默认被static 和 final修饰
     *      接口可以继承，并且可以多继承  接口可以多实现  可以同时继承和实现接口（接口和抽象类中抽象方法重名时，优先继承接口）
     * */

    final static String address = "China";

    // 接口里面的是抽象方法访问权限默认为public 也只能是public 接口的方法是抽象方法，也只能抽象方法

    public void login();


    // jdk 1.8后有默认的方法

    default void method(String name){

    }
}
