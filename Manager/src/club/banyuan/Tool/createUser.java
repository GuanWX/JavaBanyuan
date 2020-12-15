package club.banyuan.Tool;

import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 3:17 下午
 */
public class createUser {
    public static void main(String[] args) {


        final File file = new File("java-banyuan/Manager/User.json");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        List<User> users = new ArrayList<>();
        users.add(new User("guan","123456", 0,"客户"));
        users.add(new User("wen","654321",1,"经理"));
        String s = JSONObject.toJSONString(users, SerializerFeature.PrettyFormat,// 格式
                SerializerFeature.WriteMapNullValue, // 为空也会输出
                SerializerFeature.WriteDateUseDateFormat);
        try {
            OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file));
            writer.write(s);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
