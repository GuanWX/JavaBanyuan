package club.banyuan.UserServer;

import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import java.net.Socket;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 8:24 下午
 */
public class AddUser {
    public AddUser() {
    }
    public void addUser(Socket socket,String data){
        UserServer userServer = new UserServer();
        final JSONObject jsonObject = JSONObject.parseObject(data);
        String name = jsonObject.getString("name");
        String pwd = jsonObject.getString("pwd");
        String pwdConfirm = jsonObject.getString("pwdConfirm");
        String userType = jsonObject.getString("userType");
        if (userServer.Check(name,pwd,pwdConfirm,userType,socket)){
            final User user = new User(name, pwd, Integer.parseInt(userType), (userType.equals("0") ? "客户" : "经理"));
            List<User> users = userServer.getUsers();
            users.add(user);
            userServer.writeUsers(socket,users);
        }
    }
}