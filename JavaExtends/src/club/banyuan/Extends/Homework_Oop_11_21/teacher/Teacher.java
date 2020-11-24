package club.banyuan.Extends.Homework_Oop_11_21.teacher;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 2:43 下午
 */
public class Teacher {
//     1) 创建一个老师类:Teacher
// 2) 为老师添加字段:id,name,sex,age,height
//3) 分别为字段添加对应的属性:
//    id:int，不用校验
//    name:string，长度大于一位少于四位
//    sex:string，只能是男和女
//    age:int，只能在20-55之间
//    height:double，只能在1.50-1.80之间
//    定义一个ShowData方法，打印编号、姓名、性别、身高
//4） 创建一个老师对象，调用其ShowData();
    private int id;
    private String name;
    private char sex;
    private int age ;
    private double height;

    public Teacher(int id, String name, char sex, int age, double height) {
        if (checkName(name) & checkSex(sex) & checkAge(age) & checkHeight(height)) {
            this.id = id;
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }
    }
    public boolean checkName(String name){
        if (name==null||name.length()>4||name.equals("")){
            System.err.println("名字：'" +name+ "'不合法，名字长度在1-4之间");
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
        if (age <20 || age >55){
            System.err.println("年龄：'"+age+"'不合法，年龄的范围是20-55岁");
            return false;
        }
        return true;
    }
    public boolean checkHeight(double height){
        if (height <1.5 || height >1.8){
            System.err.println("身高：'"+height+"'不合法，身高的范围是1.50-1.80");
            return false;
        }
        return true;
    }


    public void showData() {
        String str= "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                '}';
        System.out.println(str);
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher(1,"管文轩",'男',22,1.67);
        teacher.showData();
    }
}
