package club.banyuan.BillServer;

import club.banyuan.ProviderServer.ProviderServer;
import club.banyuan.http.Return;
import club.banyuan.structure.Bill;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 8:23 下午
 */
public class UpdataBill {
    public void getBill(Socket socket, String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        final BillServer billServer = new BillServer();
        final List<Bill> bills = billServer.getBills();
        final Bill bill1 = bills.stream().filter(bill -> bill.getId() == id).findFirst().orElseThrow();
        Map<String, Bill> result = new HashMap<>();
        result.put("data",bill1);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
    public void updataBill(Socket socket , String data){
        final BillServer billServer = new BillServer();
        final List<Bill> bills = billServer.getBills();

        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        final int isPay = Integer.parseInt(jsonObject.getString("isPay"));
        final int providerId = Integer.parseInt(jsonObject.getString("providerId"));
        final String money = jsonObject.getString("money");
        final String product = jsonObject.getString("product");
        final String providerName = new ProviderServer().findById(providerId).getName();
        final String isPayStr = (isPay==0)?"否":"是";
        final String updateTime = billServer.time();

        final Bill bill1 = bills.stream().filter(bill -> bill.getId() == id).findFirst().orElseThrow();
        bill1.setIspay(isPay);
        bill1.setIsPayStr(isPayStr);
        bill1.setMoney(money);
        bill1.setProduct(product);
        bill1.setProviderId(providerId);
        bill1.setProviderName(providerName);
        bill1.setUpdateTime(updateTime);
        billServer.writeBill(socket,bills);
    }
}
