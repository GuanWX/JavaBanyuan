package club.banyuan.UserServer;

import club.banyuan.Tool.Config;
import club.banyuan.http.Return;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/15 11:27 上午
 */
public class UserServer {
    private List<User> users;
    public UserServer() {
        File file = new File(Config.UserData);
        try (InputStream inputStream = new FileInputStream(file);){
            String s = new String(inputStream.readAllBytes());
            users = JSONObject.parseArray(s, User.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<User> getUsers() {
        return users;
    }
    public int findIdMax(){
        int result = 0;
        for (User user :users) {
            if (user.getId()>result){
                result = user.getId();
            }
        }
        return result;
    }
    public void writeUsers(Socket socket, List<User> usersNew){
        final String s = JSONObject.toJSONString(usersNew, SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue);
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(Config.UserData))){
            out.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<>();
        result.put("data","操作成功");
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
    public boolean Check(String name,String pwd,String pwdConfirm,String userType,Socket socket){
        Map<String, String> result = new HashMap<>();
        if ((name.length() * pwd.length()*pwdConfirm.length()*userType.length())==0 ) {
            result.put("data","必填项为空");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            return false;
        }
        for (User user :users) {
            if (name.equals(user.getName())){
                result.put("data","用户名重复");
                Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
                return false;
            }
        }
        if (!pwd.equals( pwdConfirm )){
            result.put("data","两次密码不一致");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            return false;
        }
        return true;
    }
}
