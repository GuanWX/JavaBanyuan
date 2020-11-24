package club.banyuan.Extends.Homework_Oop_11_21;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 3:04 下午
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length=1;
        width=1;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
    public double perimeter(){
        return 2*(length+width);
    }
    public double area(){
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2,3.5);

        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle1.area());
        System.out.println(rectangle2.perimeter());
        System.out.println(rectangle2.area());
    }
}
