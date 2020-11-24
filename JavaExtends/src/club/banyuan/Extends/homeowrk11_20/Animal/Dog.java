package club.banyuan.Extends.homeowrk11_20.Animal;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:59 上午
 */
public class Dog extends Animals{
    public Dog() {
    }

    public Dog(String color, int legsNumber) {
        super(color, legsNumber);
    }

    public void lookHome(){
        System.out.println("看家");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("黄色",4);
        Dog dog = new Dog("黑色",4);
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
