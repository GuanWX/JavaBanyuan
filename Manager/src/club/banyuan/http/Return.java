package club.banyuan.http;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import java.io.*;
import java.net.Socket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 10:13 上午
 */
public class Return {
    public static void returnFile(Socket socket, File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            DataOutputStream Out = new DataOutputStream(socket.getOutputStream());
            if (file.getName().equals("404.html")) {
                Out.writeBytes("HTTP/1.1 404 NotFind\n");
            }
            Out.writeBytes("HTTP/1.1 200 ok\n");
            Out.writeBytes("Content-Length: " + fileInputStream.available() + "\n");
            /**
             * 此处的url中包含了html  和css  的一些静态的资源
             *    但是静态资源在前端页面的渲染方式又不一样  所以在这里做个判断
             */
            if (file.getName().endsWith(".html")) {
                Out.writeBytes("Content-Type: text/html; charset=utf-8;\n");
            } else if (file.getName().endsWith(".css")) {
                Out.writeBytes("Content-Type: text/css; charset=utf-8;\n");
            }
            //使用换行符对响应头和文件数据进行分开  不然文件数据没法显示在页面上
            Out.writeBytes("\n");
            Out.write(fileInputStream.readAllBytes());
            Out.flush();
            socket.close();
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void returnJson(Socket socket, String status , Object json){
        try {
            OutputStream out;
            DataOutputStream Out = new DataOutputStream(socket.getOutputStream());
            String jsonString = JSONObject.toJSONString(json, SerializerFeature.PrettyFormat,SerializerFeature.WriteMapNullValue);
            Out.writeBytes(status+"\n");
            //告诉前端页面 后端响应的数据是以json格式返回的
            Out.writeBytes("Content-Type: application/json; charset=utf-8\n");
            //返回的数据的长度
            Out.writeBytes("Content-Length: " + jsonString.getBytes().length + "\n");
            Out.writeBytes("\n");
            Out.write(jsonString.getBytes());
            Out.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
