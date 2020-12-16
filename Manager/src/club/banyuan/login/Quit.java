package club.banyuan.login;

import club.banyuan.Tool.UserOnLine;
import club.banyuan.http.Return;

import java.io.IOException;
import java.net.Socket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/16 9:19 上午
 */
public class Quit {
    public Quit() {
    }
    public void quit(Socket socket){
        final String hostAddress = socket.getInetAddress().getHostAddress();
        UserOnLine.userOnLine.remove(hostAddress);
        Return.returnJson(socket,"HTTP/1.1 200 ok\n",null);
    }
}
