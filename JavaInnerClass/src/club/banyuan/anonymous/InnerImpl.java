package club.banyuan.anonymous;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 3:37 下午
 */
public class InnerImpl implements Inner{

    // 正常的实现接口，
    @Override
    public int compare(int a, int b) {
        if (a>b){
            return a;
        }
        return b;
    }
}
class TestInterface{
    public static void main(String[] args) {
        Inner inner = new InnerImpl();
        System.out.println(inner.compare(10,20));
        /**
         * 匿名内部类 一般和接口或者抽象类一起使用
         * */
        int a= new Inner(){
            // 使用匿名对想实现接口,返回最大值
            @Override
            public int compare(int a, int b) {
                if (a>b){
                    return a;
                }
                return b;
            }
        }.compare(10,20);
        System.out.println(a);

        Inner inner1 = new Inner(){
            // 使用匿名对想实现接口,返回最小值
            @Override
            public int compare(int a, int b) {
                if (a>b){
                    return b;
                }
                return a;
            }
        };
        System.out.println(inner1.compare(100,1000));
    }
}
