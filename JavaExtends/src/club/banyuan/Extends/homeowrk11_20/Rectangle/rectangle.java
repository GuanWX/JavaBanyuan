package club.banyuan.Extends.homeowrk11_20.Rectangle;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/20 5:09 下午
 */
public class rectangle {
    private double length;
    private double width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    public double area(){
        return length*width;
    }
}
