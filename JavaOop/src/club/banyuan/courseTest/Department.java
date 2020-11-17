package club.banyuan.courseTest;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 3:24 下午
 */
public class Department {
    /**
     * 部门： 编号 名称 员工[]
     * */
    private String departmentId;
    private String departmentName;
    private Employee [] employees;

    public Department(String departmentId, String departmentName, Employee[] employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public Department() {

    }


    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void addEmloyees(Employee employee){
        String employeeId = employee.getDepartmentId();
        String employeeName = employee.getEmployeeName();
        String employeePhone = employee.getEmployeePhone();
        String employeeJob = employee.getEmployeeJob();
        String employeeTime = employee.getEmployeeTime();
        double employeePrice = employee.getEmployeePrice();
        Employee employee1 = new Employee(employeeId, employeeName, employeePhone, employeeJob, employeeTime, departmentId,employeePrice);
        if (null == this.employees) {
            this.employees = new Employee[1];
            this.employees[0] = employee1;
        }else{
            Employee[] temp = new Employee[this.employees.length+1];
            for (int i = 0; i < this.employees.length; i++) {
                temp[i]= this.employees[i];
            }
            this.employees[this.employees.length-1] = employee1;
        }
    }
    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
    public String getInfoEmp(){
        if (null!=this.employees) {
            String str = "";
            for (int i = 0; i < this.employees.length; i++) {
                str = str + employees[i].toString() + "\n";
            }
            return str;
        }
        return null;
    }
}
