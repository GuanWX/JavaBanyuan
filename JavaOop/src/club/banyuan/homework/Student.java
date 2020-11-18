package club.banyuan.homework;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 7:16 下午
 */
public class Student {
    private String stuName;
    private int stuId;
    private String stuAddress;
    private subject [] subjects=new subject[3];

    public Student(String stuName, int stuId, String stuAddress, subject[] subjects){
        if (stuName.length() < 20 && stuName.length() > 0) {
            this.stuName = stuName;
        }else {
            System.out.println("名字格式不合法，请不要超过20个字符");
        }
        if (stuId <= 1000 && stuId > 0) {
            this.stuId = stuId;
        }else {
            System.out.println("ID格式不合法，请输入0——1000之间的数字");
        }
        if (stuAddress.length() <= 150) {
            this.stuAddress = stuAddress;
        }else {
            System.out.println("输入的地址请不要超过150个字符");
        }
        this.subjects=subjects;
    }

    public void setStuName(String stuName) {
        if (stuName.length() < 20 && stuName.length() > 0) {
            this.stuName = stuName;
        }else {
            System.out.println("名字格式不合法，请不要超过20个字符");
        }
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuId(int stuId) {
        if (stuId <= 1000 && stuId > 0) {
            this.stuId = stuId;
        }else {
            System.out.println("ID格式不合法，请输入0——1000之间的数字");
        }
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuAddress(String stuAddress) {
        if (stuAddress.length() <= 150) {
            this.stuAddress = stuAddress;
        }else {
            System.out.println("输入的地址请不要超过150个字符");
        }
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public String getInfo() {
        return "名字是："+stuName+"\tID是："+stuId+"\t家庭住址："+stuAddress;
    }

    /**
     * 调用print(Student)时可以直接返回以下值，
     * print()会调用valueof();
     * valueof()会调用toString(),重写toString可以直接返回以下值
     *
     * */
    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuAddress='" + stuAddress + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                '}';
    }
}
