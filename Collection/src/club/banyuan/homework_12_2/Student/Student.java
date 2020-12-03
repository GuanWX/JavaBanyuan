package club.banyuan.homework_12_2.Student;

import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/2 4:37 下午
 */
public class Student{
    private String id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class TestStu{
    static LinkedHashSet<Student> students = new LinkedHashSet<>();
    public static void main(String[] args) {
        ArrayList<Student> temp = new ArrayList<>();
        temp.add(new Student("B004","烟囱",23));
        temp.add(new Student("B001","管文轩",25));
        temp.add(new Student("B003","黄昕睿",21));
        temp.add(new Student("B002","殷良鸿",17));
        temp.add(new Student("B002","陈明",24));
        add(temp);
        show();

        sortByAge();
        show();

        sortById();
        show();

    }
    public static void add(ArrayList<Student> temp){
        Object [] addData = temp.toArray();
        for (Object o :addData) {
            students.add((Student) o);
        }
    }

    public static void show(){
        Iterator iterator = students.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n");
    }
    public static void sortById(){
        List list = Arrays.asList(students.toArray());
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        students = new LinkedHashSet<>(list);
    }
    public static void sortByAge(){
        List list = Arrays.asList(students.toArray());
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        students = new LinkedHashSet<>(list);
    }
}
