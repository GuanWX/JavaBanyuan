package club.banyuan.Extends.homework11_24.role;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 8:00 下午
 */
public class Manager extends Employee{
    private final String vehicle;

    public Manager(String name, int age, boolean sex, double salary, String Id, String vehicle) {
        super(name, age, sex, salary, Id);
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",vehicle='" + vehicle + '\'' ;
    }
}
class Test{
    public static void main(String[] args) {
        Employee employee = new Employee("A",20,true,10000,"B16022335");
        Manager manager = new Manager("B",30,false,15000,"B16010101","奥拓");
        System.out.println(employee);
        System.out.println(manager);

        employee.play();
        employee.sing();

        manager.play();
        manager.sing();
    }
}