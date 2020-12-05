package club.banyuan.Set.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/3 10:48 上午
 */
public class Student {
    private String name;
    private double score1;
    private double score2;
    private double score3;

    public Student() {
    }

    public Student(String name, double score1, double score2, double score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    public double score(){
        return score1+score2+score3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score() +
                '}';
    }

    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student("A",23,45,55));
        students.add(new Student("B",56,75,95));
        students.add(new Student("C",23.1,15.5,25.5));

        List list = Arrays.asList(students.toArray());
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.score()>o2.score() ? -1 : 1;
            }
        });
        students= new LinkedHashSet<>(list);
        System.out.println(students);
    }
}