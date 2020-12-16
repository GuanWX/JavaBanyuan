package club.banyuan.BillServer;

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

}
