package club.banyuan.Extends.homeowrk11_20.PersonWorker;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:11 上午
 */
public class Worker {
    private String name;
    private String Id;
    private double wage;

    public Worker(String name, String id, double wage) {
        this.name = name;
        Id = id;
        this.wage = wage;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String work() {
        return "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", wage=" + wage ;
    }
}
