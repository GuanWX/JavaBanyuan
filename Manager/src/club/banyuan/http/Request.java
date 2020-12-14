package club.banyuan.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.URL;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 2:50 下午
 */
public class Request {
    private String Url;
    private String Host;
    private String Data;
    private int ContentLength;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String host) {
        Host = host;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public int getContentLength() {
        return ContentLength;
    }

    public void setContentLength(int contentLength) {
        ContentLength = contentLength;
    }

    public Request() {
    }
    public Request(Socket socket) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s;
            Url = reader.readLine().split(" ")[1];
            Host = reader.readLine().split(" ")[1];
            System.out.println(socket.getInetAddress().getHostAddress()+" request "+getUrl());
            while ((s= reader.readLine())!=null && s.length()!=0){
                if (s.startsWith("Content-Length:")){
                    setContentLength(Integer.parseInt(s.split(" ")[1]));
                }
            }
            if (ContentLength > 0) {
                char[] payload = new char[ContentLength];
                int read = reader.read(payload);
                String data = new String(payload, 0, read);
                System.out.println("data:" + data);
                setData(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
