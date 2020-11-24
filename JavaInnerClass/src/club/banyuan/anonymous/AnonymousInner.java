package club.banyuan.anonymous;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 3:35 下午
 */
public class AnonymousInner {
    /**
     * 匿名内部类 一般和接口或者抽象类一起使用
     * */
    public static void main(String[] args) {
        new InnerAb(){
            @Override
            public void login() {
                System.out.println("匿名类重写抽象方法");
            }
        }.login();

        InnerAb innerAb = new InnerAb() {
            @Override
            public void login() {
                System.out.println("另外的匿名类，继承抽象方法");
            }
        };
        innerAb.login();
    }
}
