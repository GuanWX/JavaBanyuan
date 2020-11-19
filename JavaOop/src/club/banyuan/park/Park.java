package club.banyuan.park;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/18 2:33 下午
 */
public class Park {
    /** 停车场的默认大小是100个车位，可以通过构造函数进行修改*/
    private int maxSize;
    Car [] cars;

    public Park(){
        // this() 表示调用类的有参构造器，this()前面的不能有任何语句，this()必须在第一个位置
        this(100);
    }
    public Park(int maxSize) {
        this.maxSize = maxSize;
        cars  = new Car[maxSize];
    }
    /**
     * 构造代码块，默认在所有构造器前执行*/
    {
        System.out.println("构造一个停车场");
    }

    public int getMaxSize() {
        return maxSize;
    }
/**
     可以通过重新设定大小的方式对停车场大小进行调整，
     仅支持扩大停车场规模，不支持缩小规模
*/
    public void setMaxSize(int maxSize) {
        if (maxSize>this.maxSize){
            this.maxSize = maxSize;
            this.cars  = Arrays.copyOf(this.cars,maxSize);
        }
    }

    public Car[] getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Park{" +
                "maxSize=" + maxSize +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

}
