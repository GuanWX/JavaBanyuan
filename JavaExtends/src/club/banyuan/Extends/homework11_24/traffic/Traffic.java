package club.banyuan.Extends.homework11_24.traffic;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 7:28 下午
 */
public abstract class Traffic {
     public void buyTicket(){
          System.out.print("1.买票");
     }
     public abstract void tran();
     public void goHome(){
          System.out.print("3.回家过年");
     }
}
class Test{
     public static void main(String[] args) {
          Traffic[] traffic  = new Traffic[3];
          traffic[0] = new BusImpl();
          traffic[1]  = new trainImpl();
          traffic[2] = new planImpl();

          String [] name = {"小明","小王","小李"};
          for (int i = 0; i < 3; i++) {
               System.out.print(name[i]);
               traffic[i].buyTicket();
               traffic[i].tran();
               traffic[i].goHome();
               System.out.println();
          }

     }
}