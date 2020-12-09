package club.banyuan.Homwork.Homwork12_09_1;

import java.io.*;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 8:02 下午
 */
public class Read {
    public static void main(String[] args) {
        File file = new File("java-banyuan/File/test.txt");
        try(InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)) {
            final byte[] bytes = bufferedInputStream.readAllBytes();
            System.out.println(new String(bytes));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
