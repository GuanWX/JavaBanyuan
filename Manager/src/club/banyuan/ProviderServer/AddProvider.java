package club.banyuan.ProviderServer;

import club.banyuan.Tool.Config;
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
 * @date 2020/12/16 11:09 上午
 */
public class AddProvider {
    public void add(Socket socket,String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final String name = jsonObject.getString("name");
        final String desc = jsonObject.getString("desc");
        final String phone = jsonObject.getString("phone");
        final String contactPerson = jsonObject.getString("contactPerson");
        Map<String, String> result = new HashMap<>();
        if (name.length()==0){
            result.put("data","必填项为空");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            return;
        }
        final ProviderServer providerServer = new ProviderServer();
        final List<Provider> providers = providerServer.getProviders();
        providers.add(new Provider(Config.ProviderCount+1,name,desc,phone,contactPerson));
        Config.ProviderCount++;
        providerServer.writeProvider(socket,providers);
    }
}
