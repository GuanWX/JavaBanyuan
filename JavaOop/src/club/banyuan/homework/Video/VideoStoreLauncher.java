package club.banyuan.homework.Video;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/19 6:43 下午
 */
public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("黑客帝国");
        videoStore.addVideo("教父");
        videoStore.addVideo("星球大战");
        videoStore.listInventory();

        videoStore.receiveRating("黑客帝国",5);
        videoStore.receiveRating("黑客帝国",4);
        videoStore.receiveRating("黑客帝国",1);

        videoStore.receiveRating("教父",4);
        videoStore.receiveRating("星球大战",3);

        videoStore.listInventory();

        videoStore.checkOut("黑客帝国");
        videoStore.checkOut("教父");
        videoStore.checkOut("星球大战");
        videoStore.listInventory();

        videoStore.returnVideo("黑客帝国");
        videoStore.returnVideo("星球大战");
        videoStore.listInventory();

        videoStore.returnVideo("教父");
        videoStore.listInventory();
    }
}
