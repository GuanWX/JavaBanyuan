package club.banyuan.courseTest;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 3:16 下午
 */
public class Company {
    /**
     * 公司编号
     * 公司名称
     * 法人
     * 地址
     * 部门
     * 产品
     * */
    private String companyId;
    private String companyName;
    private Employee Boss;
    private String companyAdds;
    private Department [] department ;
    private Product [] product;

    public Company(String companyId, String companyName, Employee Boss, String companyAdds, Department[] department, Product[] product) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.Boss = Boss;
        this.companyAdds = companyAdds;
        this.department = department;
        this.product = product;
    }

    public String getCompanyId() {
        return companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getBoss() {
        return Boss.toString();
    }

    public String getCompanyAdds() {
        return companyAdds;
    }

    public Department[] getDepartment() {
        return department;
    }

    public String showDepartment() {
        if (department == null){
            return null;
        }
        String [] strs = new String[department.length];
        for (int i = 0; i <department.length ; i++) {
            strs[i]=department[i].toString();
        }
        return Arrays.toString(strs);
    }

    public Product[] getProduct() {
        return product;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setBoss(Employee boss) {
        Boss = boss;
    }

    public void setCompanyAdds(String companyAdd) {
        this.companyAdds = companyAdd;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }
    public void addDepartment(Department department){
        Department department1 = new Department(department.getDepartmentId(), department.getDepartmentName(),department.getEmployees());
        if (null==this.department){
            this.department = new Department[1];
            this.department[0]= department1;
        }else {
            Department[] temp = new Department[this.department.length+1];
            for (int i = 0; i < this.department.length; i++) {
                temp[i]=this.department[i];
            }
            temp[this.department.length]=department1;
            this.department=temp;
        }
    }

    public void addEepForDep(String departmentId){

    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId='" + companyId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", Boss=" + Boss +
                ", companyAdds='" + companyAdds + '\'' +
                '}';
    }
}
