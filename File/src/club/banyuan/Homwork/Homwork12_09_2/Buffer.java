package club.banyuan.Homwork.Homwork12_09_2;

import java.io.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 8:09 下午
 */
public class Buffer {
    public static void main(String[] args) {
        File file = new File("java-banyuan/File/test.txt");
        File fileNew1 = new File("java-banyuan/File/BufferCopy/test1.txt");
        File fileNew2 = new File("java-banyuan/File/BufferCopy/test2.txt");

        try(BufferedInputStream in = new BufferedInputStream( new FileInputStream(file));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileNew1))) {
            if (!fileNew1.exists()){
                if(!fileNew1.createNewFile()){
                    throw new IOException(fileNew1.getName()+"created failed");
                }
            }
            int c;
            while ((c=in.read())!=-1){
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileNew2)))) {
            if (!fileNew2.exists()){
                if(!fileNew2.createNewFile()){
                    throw new IOException(fileNew2.getName()+"created failed");
                }
            }
            int c;
            while ((c=reader.read())!=-1){
                System.out.println(c);
                writer.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
