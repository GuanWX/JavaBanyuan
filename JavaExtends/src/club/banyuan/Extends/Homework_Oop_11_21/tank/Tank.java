package club.banyuan.Extends.Homework_Oop_11_21.tank;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 2:22 下午
 */
public class Tank {
//    定义一个Tank类(坦克类)，为其定义x（横坐标），y（纵坐标），dir（方向：值为上下左右），Type（类型）4个属性，其访问修饰符均为公有；
//    为Tank类定义一个构造方法实现4个字段的初始化
//    为Tank类定义一个ShowData方法，控制台打印4个字段值
//    创建一个Tank对象，横坐标为10，纵坐标为50，方向为右，类型为重型坦克，并通过调用对象的ShowData()方法打印Tank信息

    public double x;
    public double y;
    public char dir;
    public String type;

    public boolean checkDir(char dir){
        char[] chars = {'上','下','左','右'};
        for (char ch : chars){
            if(ch==dir){
                return true;
            }
        }
        System.err.println("方向只能是上下左右，不能是'"+dir+"'");
        return false;
    }

    public Tank(double x, double y, char dir, String type) {
        if (checkDir(dir)){
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.type = type;
        }
    }


    public void showData() {
        String str = "Tank{" +
                "x=" + x +
                ", y=" + y +
                ", dir=" + dir +
                ", type='" + type + '\'' +
                '}';
        System.out.println(str);
    }

    public static void main(String[] args) {
        Tank tank =new Tank(10,50,'右',"重坦克");
        tank.showData();
    }
}
