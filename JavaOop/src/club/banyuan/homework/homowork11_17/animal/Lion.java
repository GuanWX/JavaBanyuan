package club.banyuan.homework.homowork11_17.animal;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 7:52 下午
 */
public class Lion {
    private int heightInCM = 200;

    public Lion(int heightInCM) {
        this.heightInCM = heightInCM;
    }

    public Lion(){

    }

    public int getHeightInCM() {
        return heightInCM;
    }

    public void setHeightInCM(int heightInCM) {

        if (heightInCM < 0) {
            System.err.println("高度不合法，给与一个默认高度200");
            this.heightInCM = 200;
            return;
        }
        this.heightInCM = heightInCM;
    }
}
