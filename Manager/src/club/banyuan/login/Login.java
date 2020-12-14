package club.banyuan.login;

import club.banyuan.Tool.Config;
import club.banyuan.http.Return;
import club.banyuan.structure.User;
import com.alibaba.fastjson.JSONObject;

import java.io.*;
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

    public void login(Socket socket,String data){
        File file = new File("java-banyuan/Manager/User.json");
        try {
            final JSONObject jsonObject = JSONObject.parseObject(data);
            InputStream in = new FileInputStream(file);
            byte[] bytes = in.readAllBytes();
            String s = new String(bytes);
            List<User> users = JSONObject.parseArray(s, User.class);
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getName().equals(jsonObject.getString("name"))&&
                        users.get(i).getPwd().equals(jsonObject.getString("pwd"))){
                    DataOutputStream Out = new DataOutputStream(socket.getOutputStream());
                    Out.writeBytes("\n");
                    Out.writeBytes("HTTP/1.1 200 ok\n");
                    Out.flush();
                    Out.close();
                    socket.close();
                    return;
                }
            }
            Map<String, String> result = new HashMap<>();
            result.put("data","用户名或密码错误");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
