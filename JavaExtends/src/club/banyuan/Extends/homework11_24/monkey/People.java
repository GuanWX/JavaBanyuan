package club.banyuan.Extends.homework11_24.monkey;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 6:58 下午
 */
public class People extends Monkey {
    @Override
    public void speak() {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think(){
        System.out.println("别说话！认真思考");
    }
}
