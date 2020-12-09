package club.banyuan.Homwork.Homwork12_09_1;

import java.io.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 5:03 下午
 */
public class copy {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/edz/Pictures/idea背景图/timg.jpeg");
        File fileNew1= new File("/Users/edz/Pictures/1.jpeg");
        File fileNew2= new File("/Users/edz/Pictures/2.jpeg");
        copyStream(file,fileNew1);
        copyBuffer(file,fileNew2);
    }
    public static void copyStream(File file,File fileNew1){
        // 字节流
        try(InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = new FileOutputStream(fileNew1)) {
            if (!fileNew1.exists()){
                if(!fileNew1.createNewFile()){
                    throw new IOException(fileNew1.getName()+"created failed");
                }
            }
            int c;
            while((c=inputStream.read())!=-1){
                outputStream.write((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void copyBuffer(File file,File fileNew2){
        //字符流
        try(Reader Reader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader= new BufferedReader(Reader);
            OutputStreamWriter out= new OutputStreamWriter(new FileOutputStream(fileNew2))) {
            if (!fileNew2.exists()){
                if(!fileNew2.createNewFile()){
                    throw new IOException(fileNew2.getName()+"created failed");
                }
            }
            int c;
            while ((c=bufferedReader.read())!=-1){
                out.write((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
