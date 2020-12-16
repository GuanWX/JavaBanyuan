package club.banyuan.UserServer;

import club.banyuan.Tool.UserOnLine;
import club.banyuan.http.Return;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 9:04 上午
 */
public class GetInfo {
    public GetInfo() {
    }
    public void getInfo(Socket socket ){
        String hostname = socket.getInetAddress().getHostAddress();
        if (!UserOnLine.Status(hostname)){
            Return.returnJson(socket,"HTTP/1.1 200 ok",null);
            return;
        }
        String username = UserOnLine.userOnLine.get(hostname);
        Map<String, String> result = new HashMap<>();
        result.put("data",username);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
}
