package club.banyuan.UserServer;

import club.banyuan.http.Return;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/15 10:54 上午
 */
public class DelUser {
    List<User> users;
    public void delUser(Socket socket , String data) {
        UserServer server = new UserServer();
        users= server.getUsers();
        final JSONObject jsonObject = JSONObject.parseObject(data);
        int id = Integer.parseInt(jsonObject.getString("id"));
        if (users.removeIf((user)->user.getId()==id)){
            server.writeUsers(socket,users);
        }else {
            Map<String, String> result = new HashMap<>();
            result.put("data","删除失败");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        }
    }

}
