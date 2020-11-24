package club.banyuan.Extends.homeowrk11_20.PersonWorker;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:18 上午
 */
public class Programmer extends Worker {
    public Programmer(String name, String id, double wage) {
        super(name, id, wage);
    }

    public Programmer() {
    }

    @Override
    public String work() {
        return "Programmer{"+super.work()+"}";
    }
}
