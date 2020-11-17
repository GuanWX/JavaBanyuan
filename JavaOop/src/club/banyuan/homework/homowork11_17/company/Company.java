package club.banyuan.homework.homowork11_17.company;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 8:07 下午
 */
public class Company {
    private Employee [] employee;
    public void addEmployee(int workTime,String name,int basePrice){
        if (employee==null){
            employee = new Employee[1];
            employee[0]=new Employee(workTime,name,basePrice);
        }else{
            Employee[] temp = new Employee[employee.length+1];
            for (int i = 0; i < employee.length; i++) {
                temp[i]=employee[i];
            }
            temp[employee.length]=new Employee(workTime,name,basePrice);
            employee=temp;
        }
    }

    public void deleteEmployee(String name) {
        if (employee!=null){
            for (int i = 0; i < employee.length; i++) {
                if (employee[i].getName().equals(name)){
                    Employee[] temp = new Employee[employee.length-1];
                    for (int j = 0; j < i; j++) {
                        temp[j]=employee[j];
                    }
                    for (int j = i; j < employee.length-1; j++) {
                        temp[j]=employee[j+1];
                    }
                    employee=temp;
                }
            }
        }
    }

    public void printAll(){
        if (employee!=null){
            for (int i = 0; i < employee.length; i++) {
                System.out.println(employee[i].getName()+":"+employee[i].computePrice());
            }
        }
    }

    public double sumPrice(){
        double sum=0;
        if (employee!=null){
            for (int i = 0; i < employee.length; i++) {
                sum+=employee[i].computePrice();
            }
        }
        return sum;
    }

}
