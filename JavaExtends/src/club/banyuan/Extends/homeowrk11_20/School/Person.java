package club.banyuan.Extends.homeowrk11_20.School;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:31 上午
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
