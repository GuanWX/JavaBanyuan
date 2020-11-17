package club.banyuan.homework;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/16 7:16 下午
 */
public class Student {
    private String stuName;
    private int stuId;
    private double stuScore;
    private String stuAddress;
    public Student(String stuName, int stuId, double stuScore, String stuAddress){
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
        if (stuScore >= 0 && stuScore <= 100) {
            this.stuScore=stuScore;
        }else{
            System.out.println("输入的分数不合法，请输入0-100之间的数字");
        }
        if (stuAddress.length() <= 150) {
            this.stuAddress = stuAddress;
        }else {
            System.out.println("输入的地址请不要超过150个字符");
        }
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

    public void setStuScore(double stuScore) {
        if (stuScore >= 0 && stuScore <= 100) {
            this.stuScore=stuScore;
        }else{
            System.out.println("输入的分数不合法，请输入0-100之间的数字");
        }
    }

    public double getStuScore() {
        return stuScore;
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
        return "名字是："+stuName+"\tID是："+stuId+"\t分数是："+stuScore+"\t家庭住址："+stuAddress;
    }

    @Override
    public String toString(){
        //调用print(Student)时可以直接返回以下值，
        /**
         * print()会调用valueof();
         * valueof()会调用toString(),重写toString可以直接返回以下值
         *
         * */
        return "名字是："+stuName+"\tID是："+stuId+"\t分数是："+stuScore+"\t家庭住址："+stuAddress;
    }
}
