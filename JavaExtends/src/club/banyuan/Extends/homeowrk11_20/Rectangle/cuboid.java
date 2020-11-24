package club.banyuan.Extends.homeowrk11_20.Rectangle;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/20 5:12 下午
 */
public class cuboid extends rectangle {
    private double higth;

    public cuboid(double length, double width, double higth) {
        super(length, width);
        this.higth = higth;
    }
    public cuboid(){

    }

    public double getHigth() {
        return higth;
    }

    public void setHigth(double higth) {
        this.higth = higth;
    }

    @Override
    public String toString() {
        return "cuboid{" +
                "higth=" + higth +
                '}';
    }
    public double volume(){
        return higth*area();
    }
}
