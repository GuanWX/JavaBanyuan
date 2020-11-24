package club.banyuan.Extends.homeowrk11_20.Animal;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:59 上午
 */
public class Animals {
    private String color;
    private int legsNumber;

    public Animals(String color, int legsNumber) {
        this.color = color;
        this.legsNumber = legsNumber;
    }

    public Animals() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegsNumber() {
        return legsNumber;
    }

    public void setLegsNumber(int legsNumber) {
        this.legsNumber = legsNumber;
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
