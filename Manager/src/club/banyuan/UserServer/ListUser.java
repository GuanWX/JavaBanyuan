package club.banyuan.UserServer;

import club.banyuan.Tool.Config;
import club.banyuan.http.Return;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.Socket;
import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 5:22 下午
 */
public class ListUser {
    public ListUser() {
    }
    public void list(Socket socket,String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final String name = jsonObject.getString("name");

        final List<User> users = new UserServer().getUsers();
        List<User> result = new ArrayList<>();
        if (name == null || name.length()==0 ){
            result = users;
        }else{
            for (User user :users) {
                if (user.getName().contains(name)){
                    result.add(user);
                }
            }
        }
        Map<String, List<User>> map = new HashMap<>();
        map.put("data",result);
        Return.returnJson(socket,"HTTP/1.1 200 ok",map);
    }
}
