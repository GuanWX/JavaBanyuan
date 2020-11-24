package club.banyuan.Extends.Homework_Oop_11_21;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 3:12 下午
 */
public class Fan {
//    创建一个名为Fan的类来模拟风扇，该类包含属性speed、on、radius，有合适
//    的构造方法,此外还要求提供一个方法用来设置风扇的速度和开关状态等信息。另外编写一个类来测试Fan的使用。
    private double speed;
    private boolean on;
    private int radius;

    public Fan() {
    }

    public Fan(double speed, boolean on, int radius) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        isoff();
    }
    public void isoff(){
        if (!on){
            speed=0;
            radius=0;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
        isoff();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                '}';
    }

    public static void main(String[] args) {
        Fan fan = new Fan(10,true,30);
        System.out.println(fan);
        fan.setOn(false);
        System.out.println(fan);
        fan.setOn(true);
        fan.setRadius(2000);
        fan.setSpeed(100.5);
        System.out.println(fan);

    }
}
