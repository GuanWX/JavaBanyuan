package club.banyuan.courseTest;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 3:19 下午
 */
public class Employee {
    /**
     * 员工： 编号 名字 联系方式 职责 入职时间 所属部门 工资
     * */
    private String employeeId;
    private String employeeName;
    private String employeePhone;
    private String employeeJob;
    private String employeeTime;
    private String departmentId;
    private double employeePrice;

    public Employee(String employeeId, String employeeName, String employeePhone, String employeeJob, String employeeTime, String departmentId, double employeePrice) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeJob = employeeJob;
        this.employeeTime = employeeTime;
        this.departmentId = departmentId;
        this.employeePrice = employeePrice;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeJob() {
        return employeeJob;
    }

    public void setEmployeeJob(String employeeJob) {
        this.employeeJob = employeeJob;
    }

    public String getEmployeeTime() {
        return employeeTime;
    }

    public void setEmployeeTime(String employeeTime) {
        this.employeeTime = employeeTime;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public double getEmployeePrice() {
        return employeePrice;
    }

    public void setEmployeePrice(double employeePrice) {
        this.employeePrice = employeePrice;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeJob='" + employeeJob + '\'' +
                ", employeeTime='" + employeeTime + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", employeePrice=" + employeePrice +
                '}';
    }

}
