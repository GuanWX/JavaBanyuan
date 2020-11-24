package club.banyuan.Extends.homeowrk11_20.PersonWorker;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 9:22 上午
 */
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("programmer","A0002",1000);
        Manager manager = new Manager("manager","A0001",10000,500);
        System.out.println(manager.work());
        System.out.println(programmer.work());
    }
}
