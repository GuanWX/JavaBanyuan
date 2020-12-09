package club.banyuan.Homwork.Homwork12_09_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 6:50 下午
 */
public class WriteObject {
    public static void main(String[] args)  {
        File file = new File("java-banyuan/File/User.txt");
        List<User> users = new ArrayList<>();
        users.add(new User("管文轩", 22, "山东省"));
        users.add(new User("殷良鸿", 3, "江苏省"));
        users.add(new User("陈明",10,"太平洋"));
        users.add(new User("找影院",20,null));
        try(ObjectOutput objectInput = new ObjectOutputStream(new FileOutputStream(file))) {
            if (!file.exists()){
                if(!file.createNewFile()){
                    throw new IOException(file.getName()+"created failed");
                }
            }
            for (User user :users) {
                objectInput.writeObject(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ObjectInput objectInput= new ObjectInputStream(new FileInputStream(file))) {
            Object o;
            try{
                while ((o= objectInput.readObject())!=null){
                    User user = (User) o;
                    System.out.println(user.toString());
                }
            }catch (EOFException e){
                System.out.println("输出完成");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class User implements Serializable{
    private String name;
    private int age;
    private String address;

    public User() {
    }

    public User(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
