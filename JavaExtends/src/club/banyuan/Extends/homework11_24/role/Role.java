package club.banyuan.Extends.homework11_24.role;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/24 7:49 下午
 */
public abstract class Role {
    private String name;
    private int age;
    // true 为男性 ，flase为女性
    private boolean sex;

    public Role(String name, int age, boolean sex) {
        this(name, age);
        this.sex = sex;
    }

    public Role() {
    }
    public Role(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char isSex() {
        return ((sex)?('男'):('女'));
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + ((sex)?('男'):('女'));
    }

    public abstract void play();
}
