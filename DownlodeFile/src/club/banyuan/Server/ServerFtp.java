package club.banyuan.Server;


import java.io.*;
import java.net.Socket;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:50 上午
 */
public class ServerFtp implements Runnable{
    String path;

    public ServerFtp() {
    }

    public ServerFtp(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("ServerFtp open");
        try {
            Socket socket = new Socket("192.168.10.232",19002);
            File file = new File(path);
            if (file.isFile()){
                InputStream fileStream = new FileInputStream(file);
                OutputStream socketOut = socket.getOutputStream();
                int c;
                while ((c=fileStream.read())!=-1){
                    socketOut.write(c);
                }
                new Thread(new ServerSocket()).start();
                socketOut.close();
            }else {
                new Thread(new ServerSocket()).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
