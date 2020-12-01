package club.banyuan.homework.Student;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 8:26 下午
 */
public class Student {
    private String name;
    private String classroom;
    private double score;

    public Student() {
    }

    public Student(String name, String classroom, double score) {
        this.name = name;
        this.classroom = classroom;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 && Objects.equals(name, student.name) && Objects.equals(classroom, student.classroom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, classroom, score);
    }
}
class TestStu{
    public static void main(String[] args) {
        LinkedList<Student> students= new LinkedList<>();
        students.add(new Student("a","A001",98.5));
        students.add(new Student("b","A001",91.5));
        students.add(new Student("c","B001",81.5));
        students.add(new Student("d","B001",88.5));
        students.add(new Student("e","C001",85.5));
        for (Student student :students) {
            System.out.println(student);
        }

    }
}