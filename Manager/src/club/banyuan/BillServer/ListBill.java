package club.banyuan.BillServer;

import club.banyuan.http.Return;
import club.banyuan.structure.Bill;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 7:50 下午
 */
public class ListBill {
    public void listBill(Socket socket,String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final String product = jsonObject.getString("product");
        final int isPay = Integer.parseInt(jsonObject.getString("isPay"));
        List<Bill> bills = new BillServer().filter(product,isPay);
        Map<String, List<Bill>> result = new HashMap<>();
        result.put("data",bills);
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
}
