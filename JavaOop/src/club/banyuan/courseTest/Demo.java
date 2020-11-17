package club.banyuan.courseTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 3:49 下午
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("创建公司");
        Employee Boss = new Employee("0001","管文轩","110","老板","2020年7月19日",null,0);
        Company company = new Company("AZ00001","半圆",Boss,"南京",null,null);
        System.out.println("公司信息：");
        System.out.println(company);
        System.out.println(company.getBoss());

        System.out.println(company.showDepartment());
        Department department1 = new Department("BM001","人事部门",null);
        company.addDepartment(department1);
        System.out.println(company.showDepartment());

//        Department department2 = new Department("BM002","研发部门",null);
        department1.setDepartmentId("BM002");
        department1.setDepartmentName("研发部门");
        company.addDepartment(department1);
        System.out.println(company.showDepartment());


        Employee employee =  new Employee("0002","陈明","120","招聘","2020年9月11日","BM001",20);
        Department [] department = company.getDepartment();
        for (int i = 0; i < department.length; i++) {
            department[i].getDepartmentId();
            if(department[i].getDepartmentId().equals( employee.getDepartmentId() )){
                company.getDepartment()[i].addEmloyees(employee);
                break;
            }
        }
        department = company.getDepartment();
        for (Department de : department){
            System.out.println(de.toString());
            System.out.println(de.getInfoEmp());
        }
    }
}
