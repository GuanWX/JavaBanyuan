package club.banyuan.InterfaceDemo;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 11:16 上午
 */
public class DemoImpl implements Demo{
    @Override
    public void login() {
        System.out.println("login");
    }
}
class Test{
    public static void main(String[] args) {
        Demo demo = new DemoImpl();
        demo.login();
    }
}
