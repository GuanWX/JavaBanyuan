package club.banyuan.homework.cake;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 7:16 下午
 */
public class ReadyMadeCake extends Cake {
    private int quantity;

    public ReadyMadeCake(int n, double r, int quantity) {
        super(n, r);
        this.quantity = quantity;
    }
    public ReadyMadeCake(){}

    @Override
    public double calcPrice() {
        return quantity*price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
