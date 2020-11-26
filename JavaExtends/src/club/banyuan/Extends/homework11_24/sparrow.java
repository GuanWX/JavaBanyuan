package club.banyuan.Extends.homework11_24;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 6:54 下午
 */
public class sparrow extends Brid{
//    麻雀
    private int age;
    private int weight;

    public sparrow(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public sparrow() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
