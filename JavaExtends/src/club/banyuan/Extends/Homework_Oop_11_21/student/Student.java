package club.banyuan.Extends.Homework_Oop_11_21.student;

import java.util.concurrent.ScheduledExecutorService;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 11:11 上午
 */
public class Student {
//     1) 创建一个学生类
// 2) 创建四个私有的字段:name,sex,age,dire
// 3) 分别为私有的字段提供属性:name长度不能超过四位,sex只能是男或女,age 1-60,dire方向只能是.net或java

    private String name;
    private char sex;
    private int age;
    private String dire;

    public Student() {
    }

    public Student(String name, char sex, int age, String dire) {
        if (checkName(name)&checkSex(sex)&checkAge(age)&checkDire(dire)){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.dire = dire;
        }
    }
    public boolean checkName(String name){
        if (name!=null&&name.length()>4){
            System.err.println("名字：'" +name+ "'不合法，名字长度过长");
            return false;
        }
        return true;
    }
    public boolean checkSex(char sex){
        if (!( sex=='男' || sex =='女')){
            System.err.println("性别：'" +sex+ "'不合法，性别好好写");
            return false;
        }
        return true;
    }
    public boolean checkAge(int age){
        if (age <1 || age >60){
            System.err.println("年龄：'"+age+"'不合法，年龄的范围是1-60岁");
            return false;
        }
        return true;
    }
    public boolean checkDire(String dire){
        if (!(".net".equals(dire)|| "java".equals(dire))){
            System.err.println("方向：'"+dire+"'不合法，方向只能是.net或者java");
            return false;
        }
        return true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (checkName(name)){
            this.name = name;
        }
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (checkSex(sex)) {
            this.sex = sex;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (checkAge(age)) {
            this.age = age;
        }
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        if (checkDire(dire)){
            this.dire = dire;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", dire='" + dire + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("abcde",'1',-1,"a");
        Student student2 = new Student("tom",'男',18,"java");
        System.out.println(student1);
        System.out.println(student2);
        student2.setName("asdfg");
        student2.checkSex('j');
        student2.setAge(70);
        student2.setDire(".net");
        student2.setDire("a");

        System.out.println(student2);
    }
}
