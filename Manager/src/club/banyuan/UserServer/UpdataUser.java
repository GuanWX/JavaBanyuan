package club.banyuan.UserServer;

import club.banyuan.http.Return;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import java.net.Socket;
import java.util.*;

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
    public void updataUser(Socket socket, String data){
        UserServer userServer = new UserServer();
        final JSONObject jsonObject = JSONObject.parseObject(data);
        int id = Integer.parseInt(jsonObject.getString("id"));
        String name = jsonObject.getString("name");
        String pwd = jsonObject.getString("pwd");
        String pwdConfirm = jsonObject.getString("pwdConfirm");
        String userType = jsonObject.getString("userType");
        String userTypeStr = (userType.equals("0"))? "客户" : "经理";
        if (userServer.Check(pwd,pwdConfirm,userType,socket)){
            try{
                User userOld = users.stream().filter((user) -> id == user.getId()).findFirst().orElseThrow();
                userOld.setName(name);
                userOld.setPwd(pwd);
                userOld.setPwdConfirm(pwdConfirm);
                userOld.setUserType(Integer.parseInt(userType));
                userOld.setUserTypeStr(userTypeStr);
                userServer.writeUsers(socket,users);
            }catch (NoSuchElementException e){
                e.printStackTrace();
                Map<String, String> result = new HashMap<>();
                result.put("data","没有这个用户");
                Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            }

        }
    }
    public void getUser(Socket socket,String data) {
        final JSONObject jsonObject = JSONObject.parseObject(data);
        int id =Integer.parseInt(jsonObject.getString("id"));
        final Optional<User> first = users.stream().filter((user) -> id == user.getId()).findFirst();
        try{
            final User user = first.orElseThrow();
            Map<String, User> result = new HashMap<>();
            result.put("data",user);
            Return.returnJson(socket,"HTTP/1.1 200 ok",result);
        }catch (NoSuchElementException e){
            e.printStackTrace();
            Map<String, String> result = new HashMap<>();
            result.put("data","没有这个用户");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        }
    }
}
