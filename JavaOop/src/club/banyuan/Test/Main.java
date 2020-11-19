package club.banyuan.Test;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/19 10:58 上午
 */
public class Main {
    public static void main(String[] args) {
        TestClass testClass1= new TestClass();
        TestClass.method1();
        TestClass testClass2 = new TestClass("a",2);
        testClass1.setAddress("南京");


        System.out.println(testClass1);
        System.out.println(testClass2);
    }
}
