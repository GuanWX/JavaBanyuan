package club.banyuan.UserServer;

import club.banyuan.http.Return;
import club.banyuan.http.Server;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/15 2:29 下午
 */
public class UpdataUser {
    List<User> users;

    public UpdataUser() {
        UserServer userServer = new UserServer();
        users =userServer.getUsers();
    }
    public void updataUser(){
    }
    public void getUser(Socket socket,String data) {
        final JSONObject jsonObject = JSONObject.parseObject(data);
        int id =Integer.parseInt(jsonObject.getString("id"));
        final Optional<User> first = users.stream().filter((user) -> id == user.getId()).findFirst();
        final User user = first.get();
        final String s = JSONObject.toJSONString(user);
        Map<String, String> result = new HashMap<>();
        result.put("data",s);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
}
