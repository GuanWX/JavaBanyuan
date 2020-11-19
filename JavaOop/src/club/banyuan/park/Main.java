package club.banyuan.park;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/18 2:33 下午
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int maxSize = 150;
        Park park = new Park(maxSize);
        ParkService parkService = new ParkService(park);


        LabelA:
        while(true){
            printMenu();
            int next = scanner.nextInt();
            switch (next){
                case 1:
                    // 创建一个车辆，将车辆添加到Park.Car[]中，位置不合适将重新选择位置。
                    Car car = createCar();
                    System.out.println("请输入停车的位置:1-"+maxSize);
                    int index1 = scanner.nextInt();
                    while (!parkService.addCar(index1,car)){
                        System.out.println("停车位置不合适，请重新输入:1-"+maxSize);
                        index1 = scanner.nextInt();
                    }
                    System.out.println("停车成功！");
                    break;
                case 2:
                    // 根据输入，在停车场中移除一个车辆
                    System.out.println("请输入移除车的位置:1-"+maxSize);
                    int index2 = scanner.nextInt();
                    parkService.removeCar(index2);
                    System.out.println("该位置的车辆已经移除");
                    break;
                case 3:
                    // 展示停车场中全部的车辆
                    System.out.println(parkService.showInfoAll());
                    break;
                case 4:
                    // 根据输入查询某个类型的车辆信息
                    System.out.println("请输入要查找的车的类型");
                    String type = scanner.next();
                    Car[] res = parkService.getByCarBrand(type);
                    System.out.println(Arrays.toString(res));
                    break;
                case 5:
                    break LabelA;
                default:
                    System.out.println("输入的值不合法，请重新输入");
                    break ;
            }
        }
    }
    /**
     * 输出菜单*/
    public static void printMenu(){
        System.out.println("*** 欢迎来到半圆租车系统 ***\n"+
                "1.添加入库车辆\n" +
                "2.移除入库车辆\n" +
                "3.查询所有的入库车辆信息\n" +
                "4.按品牌查询车辆信息\n" +
                "5.退出租车系统\n"+
                "请输入选项：");
    }
    /**
     * 根据输入内容创建一个车辆
     * */
    public static Car createCar(){
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入车牌号");
        String carId=scanner1.next();
        System.out.println("请输入车类型");
        String type = scanner1.next();
        Car car = new Car(carId,type);
        return car;
    }
}
