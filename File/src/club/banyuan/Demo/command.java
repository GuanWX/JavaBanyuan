package club.banyuan.Demo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/8 3:45 下午
 */
public class command {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
            String[] com = s.split(" ");
            if (com[0].equals("ls")){
                Ls LS = new Ls();
                switch (com.length){
                    case 1:LS.ls();break;
                    case 2:{
                        if (com[1].startsWith("-")){
                            LS.ls("",com[1]);
                        }else {
                            LS.ls(com[1]);
                        }
                        break;
                    }
                    case 3:LS.ls(com[1],com[2]);break;
                }
            }else if (com[0].equals("cp") && com.length==3){
                CP cp = new CP();
                cp.cp(com[1],com[2]);
            }else if (com[0].equals("rm")&&com.length==2){
                // 删除只能删除代码中固定的文件夹，防止误操作导致删除必要的文件
                // 创建文件夹请直接运行 src/club/banyuan/Demo/test.sh 脚本
                Del del = new Del();
                del.rm("/Users/edz/Desktop/test");
            }
        }while(!s.equalsIgnoreCase("exit"));
    }

}
class Ls{
    // 相对路径和绝对路径
    public void ls(String name){
        File file = new File(name);
        String[] list = file.list();
        for (String s : list != null ? list : new String[0]) {
            if (!s.startsWith(".")) {
                System.out.println(s);
            }
        }
    }
    public void ls(){
        File file = new File("");
        ls(file.getAbsolutePath());
    }
    public void ls(String name,String comm){
        File file = new File(name);
        File absoluteFile = file.getAbsoluteFile();
        File[] files = absoluteFile.listFiles();
        String style,size,time;
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (File f : files != null ? files : new File[0]) {
            if (!f.getName().startsWith(".")){
                if (f.isDirectory()){
                    style="d";
                    size="0";
                }else {
                    style="-";
                    size=String.valueOf(f.length());
                }
                long lastModified = f.lastModified();
                date = new Date(lastModified);
                time = simpleDateFormat.format(date);
                System.out.println(style+"\t"+size+"\t"+time+"\t"+f.getName());
            }
        }
    }
}
class CP{
    public void cp(String pathSrc,String pathDes){
        File fileSrc = new File(pathSrc);
        File fileDes = new File(pathDes);
        int k = 1;
        if (fileSrc.isFile() && fileDes.isDirectory()){
            String newFileName;
            File newFile;
            while (true){
                try {
                    newFileName = fileDes.getAbsolutePath()+"//"+fileSrc.getName()+(k>1?("("+k+")"):"");
                    newFile = new File(newFileName);
                    if (newFile.createNewFile()){
                        break;
                    }else {
                        k++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                InputStream inputStream = new FileInputStream(fileSrc.getAbsolutePath());
                OutputStream outputStream = new FileOutputStream(newFileName);
                outputStream.write(inputStream.readAllBytes());
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(fileSrc.isFile());
            System.out.println(fileDes.isDirectory());
        }
    }
}
class Del{
    public void rm(String name){
        File file =new File(name);
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files!=null&&files.length!=0){
                for (File f :files) {
                    String dir = f.getAbsolutePath();
                    rm(dir);
                }
            }
        }
        System.out.println(file.getAbsolutePath()+" delete:"+file.delete());
    }
}