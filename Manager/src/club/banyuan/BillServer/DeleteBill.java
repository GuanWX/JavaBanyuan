package club.banyuan.BillServer;

import club.banyuan.structure.Bill;
import com.alibaba.fastjson.JSONObject;

import java.net.Socket;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/17 9:16 上午
 */
public class DeleteBill {
    public void deleteBill(Socket socket,String data){
        final JSONObject jsonObject = JSONObject.parseObject(data);
        final int id = Integer.parseInt(jsonObject.getString("id"));
        BillServer billServer = new BillServer();
        final List<Bill> bills = billServer.getBills();
        bills.removeIf(bill -> bill.getId()==id);
        billServer.writeBill(socket,bills);
    }
}
