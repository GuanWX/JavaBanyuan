package club.banyuan.homework.cake;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 7:07 下午
 */
public abstract class Cake {

    protected int id;
    protected double price;

    public Cake(int n, double r) {
        id = n;
        price = r;
    }

    public Cake() {
    }

    public abstract double calcPrice();

    @Override
    public String toString() {
        return "编号是"+id + "\t单价是" + price;
    }
}
