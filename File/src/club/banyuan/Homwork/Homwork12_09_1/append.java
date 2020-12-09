package club.banyuan.Homwork.Homwork12_09_1;

import java.io.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 7:50 下午
 */
public class append {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("java-banyuan/File/test.txt");
//        try(Writer writer= new OutputStreamWriter(new FileOutputStream(file,true))) {
//            if (!file.exists()){
//                if(!file.createNewFile()){
//                    throw new IOException(file.getName()+"created failed");
//                }
//            }
//            writer.append("Hello,World!\n");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try(FileOutputStream fileOutputStream = new FileOutputStream(file,true)) {
            if (!file.exists()){
                if(!file.createNewFile()){
                    throw new IOException(file.getName()+"created failed");
                }
            }
            final char[] chars = "Hello,World!\n".toCharArray();
            for (char c :chars) {
                fileOutputStream.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
