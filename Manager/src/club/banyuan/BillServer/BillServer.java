package club.banyuan.BillServer;

import club.banyuan.Tool.Config;
import club.banyuan.http.Return;
import club.banyuan.structure.Bill;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 7:39 下午
 */
public class BillServer {
    private List<Bill> bills;
    public BillServer() {
        File file = new File(Config.BillData);
        try (InputStream inputStream = new FileInputStream(file);){
            String s = new String(inputStream.readAllBytes());
            bills = JSONObject.parseArray(s, Bill.class);
            if (bills==null){
                bills = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Bill> getBills() {
        return bills;
    }

    public int findMax(){
        int result =0;
        int temp ;
        for (Bill bill :bills) {
            temp = bill.getId();
            if (temp>result){
                result = temp;
            }
        }
        return result;
    }
    public void writeBill(Socket socket,List<Bill> billsNew){
        final String s = JSONObject.toJSONString(billsNew, SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue);
        try(BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(Config.BillData))){
            out.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<>();
        result.put("data","操作成功");
        Return.returnJson(socket,"HTTP/1.1 200 ok",result);
    }
    public List<Bill> filter(String product,int isPay){
        List<Bill> result = new ArrayList<>();
        if (isPay==-1){
             bills.stream().filter(bill -> bill.getProduct().contains(product)).forEach(result::add);
        }else {
             bills.stream().filter(bill -> bill.getProduct().contains(product)).
                    filter(bill -> bill.getIspay()==isPay).forEach(result::add);
        }
        return  result;
    }
    public String time(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
