package club.banyuan.Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/8 3:07 下午
 */
public class ReadFile {
    public static void main(String[] args) {
        File file = new File("java-banyuan/File/1.txt");
        if (file.exists()){
            ArrayList<String> strings = new ArrayList<>();
            try {
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = inputStream.readAllBytes();
                String line = new String(bytes);
                String[] lines = line.split("\n");
                for (String s: lines){
                    String[] split = s.split(",");
                    strings.addAll(Arrays.asList(split));
                }
                System.out.println(strings);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(file.toString()+"is not exited!");
        }
    }
}
