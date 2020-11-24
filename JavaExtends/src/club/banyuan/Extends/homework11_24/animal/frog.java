package club.banyuan.Extends.homework11_24.animal;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 7:07 下午
 */
public class frog extends Animal{
    @Override
    public void speak() {
        System.out.println("孤寡孤寡...");
    }
}
class Test{
    public static void main(String[] args) {
        new rabbit().speak();
        new frog().speak();
    }
}
