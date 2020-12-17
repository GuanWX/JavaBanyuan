package club.banyuan.BillServer;

import club.banyuan.ProviderServer.ProviderServer;
import club.banyuan.Tool.Config;
import club.banyuan.structure.Bill;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/17 9:26 上午
 */
public class AddBill {
    public void addBill(Socket socket,String data){
        final BillServer billServer = new BillServer();
        final List<Bill> bills = billServer.getBills();

        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int isPay = Integer.parseInt(jsonObject.getString("isPay"));
        final int providerId = Integer.parseInt(jsonObject.getString("providerId"));
        final String money = jsonObject.getString("money");
        final String product = jsonObject.getString("product");
        final String providerName = new ProviderServer().findById(providerId).getName();
        final String isPayStr = (isPay==0)?"否":"是";
        final String updateTime = billServer.time();
        final Bill bill = new Bill(Config.BillCount + 1, isPay, isPayStr, money, product, providerId, providerName, updateTime);
        Config.BillCount++;
        bills.add(bill);
        billServer.writeBill(socket,bills);
    }
}
