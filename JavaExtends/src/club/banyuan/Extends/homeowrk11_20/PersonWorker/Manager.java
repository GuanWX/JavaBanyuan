package club.banyuan.Extends.homeowrk11_20.PersonWorker;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:14 上午
 */
public class Manager extends Worker {
    double bonus;

    public Manager(String name, String id, double wage, double bonus) {
        super(name, id, wage);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String work() {
        return "Manager{" + super.work() +
                "bonus=" + bonus +
                '}';
    }
}
