package club.banyuan.Extends.Homework_Oop_11_21.dog;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 10:27 上午
 */
public class Person {
    private char sex;

    public Person(char sex) {
        this.sex = sex;
    }

    public Person() {
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Person person = new Person('男');
        Dog dog = new Dog();
        dog.yao();
        dog.yao("i");
        dog.yao(person);
        person.setSex('女');
        dog.yao(person);
    }
}
