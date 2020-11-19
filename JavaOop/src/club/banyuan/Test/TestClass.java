package club.banyuan.Test;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/19 10:54 上午
 */
public class TestClass {
    private String name;
    private int age;
    private static String address="济南";

    /**
     * 构造代码块
     * */
    {
        System.out.println("构造代码块，在创建对象时执行");
    }

    static {
        System.out.println("静态代码块，优先加载，只会执行一次");
    }

    /**
     * 构造器可以被 private 默认 protected public 修饰
     * */
    public TestClass(){
        this("name",0);
    }
    public TestClass(String name){
        this.name=name;
        this.age=0;
    }
    public TestClass(String name, int age){
        this.name=name;
        this.age=age;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        TestClass.address = address;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",address="+address+
                '}';
    }

    /**
     * 1.静态方法可以直接调用
     * 2.静态方法只能访问静态变量，不能访问非静态方法；非静态方法可以访问所有变量
     * 3.static 修饰的成员被所有实体共享，
     * 4.static 修饰的成员，代码块优先加载，只会加载一次
     * 5.生命周期不同：被static 修饰的程序修饰的成员在整个程序结束之前都存在；对象成员属性随着对象回收而回收
     * 6.多个static 代码同时加载，按代码顺序执行
     * 7.this关键字能不能和static一起使用
     * */
    public static void method1(){
        System.out.println("静态方法");
        System.out.println(address);
    }
    public void method2(){
        System.out.println("非静态方法");
        System.out.println("只能通过创建对象调用");
        System.out.println(name+age+address);
    }
}
