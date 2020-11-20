package club.banyuan.homework.Video;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/19 5:13 下午
 */
public class Video {
    private String name;
    // status : true : 借出  false 没有借出
    private boolean status;
    private  double score;
    private int scoretime=0;

    public Video(String name) {
        this.name = name;
    }

    public Video() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public  double getScore() {
        return score;
    }

    public  void setScore(double score) {
        this.score = score;
    }

    public int getScoretime() {
        return scoretime;
    }

    public void setScoretime(int scoretime) {
        this.scoretime = scoretime;
    }

    @Override
    public String toString() {
        String str="未借出";
        if (status){
            str="已借出";
        }
        return "Video{" +
                "电影名：'" + name + '\'' +
                ", 影片状态：" + str +
                ", 评分：" + score +
                '}';
    }
}
