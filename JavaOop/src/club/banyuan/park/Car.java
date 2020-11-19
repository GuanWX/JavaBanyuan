package club.banyuan.park;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/18 2:33 下午
 */
public class Car {
    /**
     * @param carId 车牌号
     * @param carType 车类型
     * */
    private String carId;
    private String carType;

    public Car(String carId, String carType) {
        this.carId = carId;
        this.carType = carType;
    }
    public Car(){
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId='" + carId + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
