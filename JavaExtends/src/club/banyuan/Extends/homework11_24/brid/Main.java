package club.banyuan.Extends.homework11_24.brid;


/**
 * @author edz
 * @version 1.0
 * @date 2020/11/26 9:51 上午
 */
public class Main {
    public static void show(BridNew bird) {
        System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
    }

    public static void main(String[] args) {

        show(new BridNew() {
            //TODO
            {
                setName("燕子");
            }
            @Override
            public int fly() {
                return 1000;
            }
        });

    }
}
