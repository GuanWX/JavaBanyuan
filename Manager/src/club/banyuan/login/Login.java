package club.banyuan.login;

import club.banyuan.Tool.UserOnLine;
import club.banyuan.UserServer.UserServer;
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
 * @date 2020/12/14 2:26 下午
 */
public class Login {
    public Login() {
    }

    public void login(Socket socket,String data,String hostname){
        List<User> users = new UserServer().getUsers();

        final JSONObject jsonObject = JSONObject.parseObject(data);
        final String name = jsonObject.getString("name");
        final String pwd = jsonObject.getString("pwd");
        Map<String, String> result = new HashMap<>();
        if (!recordingLogin(hostname,name)){
            result.put("data","该用户已经登录");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            return;
        }
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(name) && users.get(i).getPwd().equals(pwd)){
                UserOnLine.userOnLine.put(hostname,name);
                System.out.println(UserOnLine.userOnLine);
                Return.returnJson(socket,"HTTP/1.1 200 ok\n",null);
                return;
            }
        }
        result.put("data","用户名或密码错误");
        Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
    }
    private boolean recordingLogin(String hostname,String Username){
        if (UserOnLine.userOnLine.containsValue(Username)){
            return false;
        }
        return true;
    }
}
