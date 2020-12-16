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
 * @date 2020/12/16 1:53 下午
 */
public class UpdataProvider {
    public void updata(Socket socket, String data){
        final ProviderServer providerServer = new ProviderServer();
        final List<Provider> providers = providerServer.getProviders();
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        final String name = jsonObject.getString("name");
        Map<String, String> result = new HashMap<>();
        if (name.length()==0){
            result.put("data","必填项为空");
            Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            return;
        }
        final String desc = jsonObject.getString("desc");
        final String phone = jsonObject.getString("phone");
        final String contactPerson = jsonObject.getString("contactPerson");
        final Provider provider1 = providers.stream().filter(provider -> provider.getId() == id).findFirst().orElseThrow();
        provider1.setName(name);
        provider1.setDesc(desc);
        provider1.setPhone(phone);
        provider1.setContactPerson(contactPerson);
        providerServer.writeProvider(socket,providers);
    }
    public void get(Socket socket ,String data){
        final ProviderServer providerServer = new ProviderServer();
        final List<Provider> providers = providerServer.getProviders();
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        final Provider provider1 = providers.stream().filter(provider -> provider.getId() == id).findFirst().orElseThrow();
        Map<String, Provider> result = new HashMap<>();
        result.put("data",provider1);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
}
