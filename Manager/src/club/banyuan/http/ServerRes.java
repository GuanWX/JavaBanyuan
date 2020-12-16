package club.banyuan.http;

import club.banyuan.BillServer.ListBill;
import club.banyuan.BillServer.UpdataBill;
import club.banyuan.ProviderServer.AddProvider;
import club.banyuan.ProviderServer.DelProvider;
import club.banyuan.ProviderServer.ListProvider;
import club.banyuan.ProviderServer.UpdataProvider;
import club.banyuan.Tool.Config;
import club.banyuan.Tool.LOCK;
import club.banyuan.Tool.UserOnLine;
import club.banyuan.UserServer.*;
import club.banyuan.login.Login;
import club.banyuan.login.Quit;
import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/14 10:12 上午
 */
public class ServerRes implements Runnable{
    Socket socket;
    public ServerRes() {
    }

    public ServerRes(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        final Request request = new Request(socket);
        String url = request.getUrl();
        if (url.startsWith("/server")){
            if (UserOnLine.Status(request.getHost()) || url.equals("/server/user/login") || url.equals("/server/user/getInfo")){
                if (url.startsWith("/server/user/")) {
                    UserServer(url,request);
                }else if (url.startsWith("/server/provider")){
                    ProviderServer(url,request);
                }else if (url.startsWith("/server/bill")){
                    BillServer(url,request);
                }
            }else {
                Map<String, String> result = new HashMap<>();
                result.put("data","请先登录");
                Return.returnJson(socket,"HTTP/1.1 400 bad_request",result);
            }
        }else {
            FileServer(url);
        }
    }
    public void FileServer(String url){
        File file = new File(Config.BasePath +url);
        if (file.exists()){
            Return.returnFile(socket,file);
        }else {
            File file404 = new File(Config.BasePath+"/404.html");
            Return.returnFile(socket,file404);
        }
    }
    public void UserServer(String url,Request request){
        switch (url){
            case "/server/user/login":
                new Login().login(socket,request.getData(), request.getHost());
                break;
            case "/server/user/list":
                new ListUser().list(socket, request.getData());
                break;
            case "/server/user/add":
                synchronized (LOCK.USERLOCK){
                    new AddUser().addUser(socket, request.getData());
                }
                break;
            case "/server/user/delete":
                synchronized (LOCK.USERLOCK){
                    new DelUser().delUser(socket, request.getData());
                }
                break;
            case "/server/user/get":
                new UpdataUser().getUser(socket, request.getData());
                break;
            case "/server/user/update":
                synchronized (LOCK.USERLOCK){
                    new UpdataUser().updataUser(socket, request.getData());
                }
                break;
            case "/server/user/getInfo":
                new GetInfo().getInfo(socket);
                break;
            case "/server/user/quit":
                new Quit().quit(socket);
        }
    }
    public void ProviderServer(String url,Request request){
        switch (url){
            case "/server/provider/list":
                new ListProvider().list(socket,request.getData());
                break;
            case "/server/provider/add":
                synchronized (LOCK.PROVIDERLOCK){
                    new AddProvider().add(socket, request.getData());
                }
                break;
            case "/server/provider/get":
                new UpdataProvider().get(socket, request.getData());
                break;

            case "/server/provider/update":
                synchronized (LOCK.PROVIDERLOCK){
                    new UpdataProvider().updata(socket, request.getData());
                }
                break;
            case "/server/provider/delete":
                synchronized (LOCK.PROVIDERLOCK){
                    new DelProvider().delete(socket, request.getData());
                }
                break;
        }
    }
    public void BillServer(String url,Request request){
        switch (url){
            case "/server/bill/list":
                new ListBill().listBill(socket,request.getData());
                break;
            case "/server/bill/get":
                new UpdataBill().getBill(socket, request.getData());
                break;
        }
    }
}
