package club.banyuan.UserServer;

import club.banyuan.http.Return;
import club.banyuan.structure.User;
import club.banyuan.structure.UserType;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 8:24 下午
 */
public class AddUser {
    public AddUser() {
    }
    public void addUser(Socket socket,String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        String name = jsonObject.getString("name");
        String pwd = jsonObject.getString("pwd");
        String pwdConfirm = jsonObject.getString("pwdConfirm");
        String userType = jsonObject.getString("userType");
        Map<String, String> result = new HashMap<>();
        if ((name.length() * pwd.length()*pwdConfirm.length()*userType.length())==0 ) {
            result.put("data","必填项为空");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        }else if (!pwd.equals( pwdConfirm )){
            result.put("data","两次密码不一致");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        }else if (!CheckName(name)){
            result.put("data","用户名重复");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        }else {
            final User user = new User(name, pwd, Integer.parseInt(userType), (userType.equals("0") ? "客户" : "经理"));
            final String s = JSONObject.toJSONString(user);
            File file = new File("java-banyuan/Manager/User.json");
            try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file,true))){
                out.write(s.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    private boolean CheckName(String name){
        File file = new File("java-banyuan/Manager/User.json");
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
            final byte[] bytes = in.readAllBytes();
            String s = new String(bytes);
            final List<User> users = JSONObject.parseArray(s, User.class);
            for (User user :users) {
                if (name.equals(user.getName())){
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
