package club.banyuan.ProviderServer;

import club.banyuan.structure.Provider;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 3:16 下午
 */
public class DelProvider {
    public void delete(Socket socket, String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        final ProviderServer providerServer = new ProviderServer();
        final List<Provider> providers = providerServer.getProviders();
        providers.removeIf(provider -> provider.getId()==id);
        providerServer.writeProvider(socket,providers);
    }
}
