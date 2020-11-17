package club.banyuan.homework.homowork11_17.four.main;

import club.banyuan.homework.homowork11_17.four.cat.Cat;
import club.banyuan.homework.homowork11_17.four.dog.Dog;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:48 下午
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("哈士奇",-100);
        Dog dog2=new Dog("金毛",100);
        Dog dog3=new Dog("柯基",40);

        Cat cat1 = new Cat("波斯","白色");
        Cat cat2 = new Cat("英短","黑色");
        System.out.println(dog1.getInfo());
        dog2.printInfo();
        dog3.playWith(cat1);

        cat1.print();
        cat2.playWith(dog1);
    }
}
