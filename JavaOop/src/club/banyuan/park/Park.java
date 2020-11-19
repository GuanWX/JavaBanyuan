package club.banyuan.park;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/18 2:33 下午
 */
public class Park {
    /** 停车场的默认大小是100个车位，可以通过构造函数进行修改*/

    private int maxSize=100;
    Car [] cars = new Car[maxSize];

    public Park(int maxSize) {
        this.maxSize = maxSize;
        cars  = new Car[maxSize];
    }

    public Park(){
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
