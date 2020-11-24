package club.banyuan.Extends.homeowrk11_20.School;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:42 上午
 */
public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {
    }

    public void teach(){
        System.out.println("教学");
    }
}
