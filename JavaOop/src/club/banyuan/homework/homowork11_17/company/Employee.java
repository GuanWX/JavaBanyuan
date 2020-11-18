package club.banyuan.homework.homowork11_17.company;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:08 下午
 */
public class Employee {
    private int workTime;
    private String name;
    private double basePrice;

    public Employee(int workTime, String name, double basePrice) {
        this.workTime = workTime;
        this.name = name;
        this.basePrice = basePrice;
    }

    public Employee(){

    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public String getName() {
        return name;
    }

    public double computePrice(){
        return basePrice+(workTime-196)*200;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "workTime=" + workTime +
                ", name='" + name + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
