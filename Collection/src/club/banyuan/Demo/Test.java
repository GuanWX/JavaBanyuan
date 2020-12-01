package club.banyuan.Demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 2:09 下午
 */
public class Test {
    public static void main(String[] args) {
        ServiceImp<User> users = new ServiceImp<>();
        User user1 = new User("A",1);
        User user2 = new User("B",2);
        User user3 = new User("B",2);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(new User("C",23));


        System.out.println(users.getCollection());

        users.show();

        Integer t = 100;
        Double k = 101.4;
        System.out.println( max(t,k));
    }
    public static  <T extends Number,K extends Number> Number max(T t,K k){
        return (t.doubleValue()> k.doubleValue())? t : k;
    }
}
