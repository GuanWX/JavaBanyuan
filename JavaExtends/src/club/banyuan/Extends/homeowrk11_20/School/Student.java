package club.banyuan.Extends.homeowrk11_20.School;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:43 上午
 */
public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    public void study(){
        System.out.println("学习");
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher("teacher",49);
        Student student = new Student("student",18);
        teacher.eat();
        teacher.teach();
        student.eat();;
        student.study();
    }
}
