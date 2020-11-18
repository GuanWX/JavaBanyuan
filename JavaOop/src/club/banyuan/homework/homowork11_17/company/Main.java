package club.banyuan.homework.homowork11_17.company;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:30 下午
 */
public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(205,"A",10000);
        company.addEmployee(220,"B",10000);
        company.addEmployee(180,"C",10000);
        company.addEmployee(196,"D",10000);
        company.printAll();
        System.out.println(company.sumPrice());
        System.out.println(company);
        company.deleteEmployee("A");
        System.out.println(company);
    }
}
