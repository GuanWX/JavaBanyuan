package club.banyuan.Extends.Homework_Oop_11_21.bank;

import java.util.Date;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/21 3:54 下午
 */
public class Customer {
    //设计一个银行账户类，其中包括：账户信息：账号、姓名、开户时间、身份证号码、账户上的金额等成员。
    // 有：存款方法、取款方法、显示开户时间的方法、获得账上的金额的方法等。并编写测试类
    final private String cardId;
    private String name;
    final private String date;
    final private String perId;
    private double money;

    public Customer(String cardId, String name, String date, String perId, double money) {
        this.cardId = cardId;
        this.name = name;
        this.date = date;
        this.perId = perId;
        this.money = money;
    }

    public void deposit(double addMoney){
        money+=addMoney;
    }
    public void withdraw(double draw){
        money-=draw;
    }

    public String getCardId() {
        return cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getPerId() {
        return perId;
    }

    public double getMoney() {
        return money;
    }


    public static void main(String[] args) {
        Customer customer = new Customer("9527","管文轩","2020-10-1","00000111",100000);
        System.out.println(customer.getMoney());
        customer.deposit(1000);
        System.out.println(customer.getMoney());
        customer.withdraw(10);
        System.out.println(customer.getMoney());

        System.out.println(customer.getDate());
    }
}
