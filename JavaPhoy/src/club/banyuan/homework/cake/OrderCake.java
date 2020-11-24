package club.banyuan.homework.cake;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 7:11 下午
 */
public class OrderCake extends Cake {
    private double weightInKG;

    public OrderCake(int n, double r,double weightInKG) {
        super(n,r);
        this.weightInKG = weightInKG;
    }

    public OrderCake() {
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(double weightInKG) {
        this.weightInKG = weightInKG;
    }

    @Override
    public double calcPrice() {
        return price*weightInKG;
    }

}
