package club.banyuan.JSON;



import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 4:23 下午
 */
public class Json {
    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food("奶茶",20.5));
        foods.add(new Food("煎饼",7.5));
        User user1 = new User("管文轩", 22, foods);
        User user2 = new User("烟囱", 23, null);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        File file = new File("java-banyuan/File/test.json");
        String s = JSONObject.toJSONString(users,SerializerFeature.PrettyFormat,// 格式
                SerializerFeature.WriteMapNullValue, // 为空也会输出
                SerializerFeature.WriteDateUseDateFormat);
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
            outputStreamWriter.append(s);
            outputStreamWriter.flush();
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try( InputStream inputStream = new FileInputStream(file);
        BufferedInputStream buffer = new BufferedInputStream(inputStream)) {
            byte[] bytes = buffer.readAllBytes();
            String s1 = new String(bytes);
            List<User> users1 = JSONObject.parseArray(s1, User.class);
            System.out.println(users1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class User implements Serializable{
    private String name;
    private int age;
    private List<Food> foods;

    public User() {
    }

    public User(String name, int age, List<Food> foods) {
        this.name = name;
        this.age = age;
        this.foods = foods;
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

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", foods=" + foods +
                '}';
    }
}
class Food implements Serializable{
    private String name;
    private double price;

    public Food() {
    }

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}