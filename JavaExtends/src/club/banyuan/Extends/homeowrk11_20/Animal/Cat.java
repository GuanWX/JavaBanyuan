package club.banyuan.Extends.homeowrk11_20.Animal;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:59 上午
 */
public class Cat extends Animals {
    public Cat() {
    }

    public Cat(String color, int legsNumber) {
        super(color, legsNumber);
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
