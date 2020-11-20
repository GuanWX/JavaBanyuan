package club.banyuan.homework.Video;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/19 5:13 下午
 */
public class VideoStore {
    private Video [] videos = new Video[0];

    public VideoStore(Video[] videos) {
        this.videos = videos;
    }

    public VideoStore() {
    }

    public Video[] getVideos() {
        return videos;
    }

    public void setVideos(Video[] videos) {
        this.videos = videos;
    }
    /** 添加一个新的电影*/
    public void addVideo(String name){
        Video video = new Video(name);
        videos = Arrays.copyOf(videos,videos.length+1);
        videos[videos.length-1]=video;
    }
    /** 根据名字借出电影，如果成功借出返回true，如果电影已经被借出，则返回false*/
    public boolean checkOut(String name){
        for (Video video : videos){
            if (name.equals(video.getName()) && !video.isStatus()){
                video.setStatus(true);
                return true;
            }
        }
        return false;
    }

    /** 根据电影名称，将电影的状态设置为false*/
    public void returnVideo(String name){
        for (Video video : videos){
            if (name.equals(video.getName()) && video.isStatus()){
                video.setStatus(false);
            }
        }
    }

    /** 通过video中的计数器和平均分和此次打分，计算更新的平均分*/
    public void receiveRating(String name, int score){
        if (score<=5&&score>=1){
            for (Video video : videos){
                if (name.equals(video.getName())){
                    int time=video.getScoretime();
                    double scoreavg=(video.getScore()*time+score)/(++time);
                    video.setScore(scoreavg);
                    video.setScoretime(time);
                }
            }
        }
    }
    /** 打印所有的电影*/
    public void listInventory(){
        System.out.println("库存的电影如下：");
        int count = 0;
        for (Video video : videos){
            count++;
            System.out.println(video.toString());
        }
        System.out.printf("总共有 %d 部电影\n\n",count);
    }
}
