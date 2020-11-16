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
    Student(String stuName,int stuId,double stuScore,String stuAddress){
        this.stuName=stuName;
        this.stuId=stuId;
        if (stuScore >= 0 && stuScore <= 100) {
            this.stuScore=stuScore;
        }
        this.stuAddress=stuAddress;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuScore(double stuScore) {
        if (stuScore >= 0 && stuScore <= 100) {
            this.stuScore=stuScore;
        }
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public String getInfo() {
        return "名字是："+stuName+"\tID是："+stuId+"\t分数是："+stuScore+"\t家庭住址："+stuAddress;
    }
}
