package club.banyuan.permissiontest;

import club.banyuan.homework.Student;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 8:46 下午
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("管文轩",1,45.5," ");
        System.out.println(student.getInfo());
    }
}
