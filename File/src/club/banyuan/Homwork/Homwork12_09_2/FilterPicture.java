package club.banyuan.Homwork.Homwork12_09_2;

import club.banyuan.Homwork.Homwork12_09_1.copy;

import java.io.File;
import java.util.Scanner;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/9 8:29 下午
 */
public class FilterPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path);
        try{
            if (!file.exists()){
                throw new RuntimeException("File isn't existed");
            }else if (!file.isDirectory()){
                throw new RuntimeException("Path isn't Directory");
            }
            final File[] files = file.listFiles();
            if (files==null){
                throw new RuntimeException("Directory is empty");
            }
            File Desktop = new File("/Users/edz/Desktop");
            for (int i = 0; i < files.length; i++) {
                if(files[i].getName().endsWith(".jpg")||files[i].getName().endsWith(".png")){
                    copy.copyStream(files[i],new File("/Users/edz/Desktop/"+files[i].getName()));
                }
            }
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }

    }

}
