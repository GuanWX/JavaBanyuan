package club.banyuan.homework;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/17 2:44 下午
 */
public class subject {
    private String subName;
    private double subScore;
    private String subId;

    public subject(String subId, String subName, double subScore) {
        this.subId=subId;
        this.subName=subName;
        this.subScore=subScore;
    }

    public String getSubId() {
        return subId;
    }

    public String getSubName() {
        return subName;
    }

    public double getSubScore() {
        return subScore;
    }

    @Override
    public String toString() {
        return "{" +
                "subName='" + subName + '\'' +
                ", subScore=" + subScore +
                ", subId='" + subId + '\'' +
                '}';
    }
}
