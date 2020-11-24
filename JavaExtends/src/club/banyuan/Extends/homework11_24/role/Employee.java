package club.banyuan.Extends.homework11_24.role;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 7:55 下午
 */
public class Employee extends Role {
    private double salary;
    private static String Id;

    public Employee(){}

    public Employee(String name, int age, boolean sex, double salary,String Id) {
        super(name, age, sex);
        this.salary = salary;
        Employee.Id = Id;
    }

    @Override
    public void play() {
        System.out.println("Employer play 个寂寞 干活去");
    }

    public final void sing(){
        System.out.println("领导我给你唱个歌吧，我们是共产主义接班人，不是资本主义接班人");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static String getId() {
        return Id;
    }

    public static void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return super.toString()+
                ",salary=" + salary +
                ",Id="+Id;
    }
}
