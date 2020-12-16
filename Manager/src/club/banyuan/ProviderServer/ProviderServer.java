package club.banyuan.ProviderServer;

import club.banyuan.Tool.Config;
import club.banyuan.http.Return;
import club.banyuan.structure.Provider;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.*;
import java.net.Socket;
import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 9:37 上午
 */
public class ProviderServer {
    private List<Provider> providers;
    public ProviderServer() {
        File file = new File(Config.ProviderData);
        try (InputStream inputStream = new FileInputStream(file);){
            String s = new String(inputStream.readAllBytes());
            providers = JSONObject.parseArray(s, Provider.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Provider> getProviders() {
        return providers;
    }
    public int findMax(){
        int result =0;
        int temp ;
        if (providers==null || providers.size()==0){
            return 0;
        }
        for (Provider provider :providers) {
            temp = provider.getId();
            if (temp>result){
                result = temp;
            }
        }
        return result;
    }
    public void writeProvider(Socket socket, List<Provider> providersNew){
        final String s = JSONObject.toJSONString(providersNew, SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue);
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(Config.ProviderData))){
            out.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<>();
        result.put("data","操作成功");
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
    public List<Provider> filter(String name , String desc){
        final List<Provider> result = new ArrayList<>();
        providers.stream().filter(provider -> provider.getName().contains(name)).
                filter(provider -> provider.getDesc().contains(desc)).forEach(result::add);
        return result;
    }
}
