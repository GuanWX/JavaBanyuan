package club.banyuan.Extends.homeowrk11_20.Rectangle;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/20 5:17 下午
 */
public class Main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle(1.1,2.2);
        cuboid cuboid1 = new cuboid(2,3,4);
        System.out.println(rectangle1.area());
        System.out.println(cuboid1.volume());
    }
}
