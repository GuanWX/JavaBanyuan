package club.banyuan.http;

import club.banyuan.Tool.Config;
import club.banyuan.Tool.LOCK;
import club.banyuan.Tool.UserOnLine;
import club.banyuan.UserServer.AddUser;
import club.banyuan.UserServer.DelUser;
import club.banyuan.UserServer.ListUser;
import club.banyuan.UserServer.UpdataUser;
import club.banyuan.login.Login;

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
            if (UserOnLine.Status(request.getHost()) || url.equals("/server/user/login")){
                System.out.println(UserOnLine.Status(request.getHost()));
                DataServer(url,request);
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
    public void DataServer(String url,Request request){
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
        }
    }
}
