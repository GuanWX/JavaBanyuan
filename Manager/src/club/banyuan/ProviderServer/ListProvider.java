package club.banyuan.ProviderServer;

import club.banyuan.http.Return;
import club.banyuan.structure.Provider;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 10:02 上午
 */
public class ListProvider {
    public ListProvider() {
    }
    public void list(Socket socket, String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final String name = jsonObject.getString("name");
        final String desc = jsonObject.getString("desc");
        List<Provider> filters = new ProviderServer().filter(name,desc);
        Map<String, List<Provider>> result = new HashMap<>();
        result.put("data",filters);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
}
