package club.banyuan.Extends.homework11_24.extendAndImpl;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 7:21 下午
 */
public class Student extends People implements Speak,Study {
    @Override
    public void eat() {
        System.out.println("Student eat...");
    }

    @Override
    public void speak() {
        System.out.println("Student speak...");
    }

    @Override
    public void study() {
        System.out.println("Student study...");
    }
}
class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.speak();
        student.study();

    }
}
