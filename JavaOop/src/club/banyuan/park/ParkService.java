package club.banyuan.park;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/18 2:56 下午
 */
public class ParkService {

    private Park park;

    public ParkService(Park park) {
        this.park = park;
    }

    public Park getPark() {
        return park;
    }

    public void setPark(Park park) {
        this.park = park;
    }

    /**
     * addCar() 添加一辆汽车到停车场中，添加成功返回true，失败返回false
     * */
    public boolean addCar(int index, Car car){
        Car[] cars = park.getCars();
        int maxSize = park.getMaxSize();
        if (index > 0 && index <= maxSize && cars[index - 1] == null) {
            cars[index-1]=car;
            return true;
        }
        return false;
    }

    /**
     * removeCar() 在停车场中去除一辆车
     * */
    public void removeCar(int index){
        Car[] cars = park.getCars();
        int maxSize = park.getMaxSize();
        if (index > 0 && index <= maxSize && cars[index - 1] != null) {
            cars[index-1]=null;
        }
    }
    /**
     * 展示Park.Car[]中的全部车辆信息。
     * */
    public String showInfoAll(){
        Car[] cars = park.getCars();
        int maxSize = park.getMaxSize();
        String str="";
        for (int i = 0; i < maxSize; i++) {
            if (cars[i]!=null){
                str = str+"第"+(i+1)+"位置是:"+cars[i].toString()+"\n";
            }
        }
        if (str.equals("")){
            return "停车场中是空的！";
        }
        return str;
    }
    /**
     * 展示Park.Car[]中，carType为 tupe 的车辆信息，返回值是Car[].
     * */
    public  Car[] getByCarBrand(String type){
        Car[] cars = park.getCars();
        int maxSize = park.getMaxSize();
        Car[] res = new Car[maxSize];
        int count = 0;
        for (int i =0;i<maxSize;i++){
            if (cars[i]!=null&&cars[i].getCarType().equals(type)){
                res[count++]=cars[i];
            }
        }
        res = Arrays.copyOf(res,count);
        return res;
    }

}
