package club.banyuan.Server;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/11 9:29 上午
 */
public class Ls {
    public ArrayList<String> ls(String name){
        File file = new File(name);
        File[] list = file.listFiles();
        ArrayList<String> result = new ArrayList<>();
        if (list == null){
            return null;
        }
        for (File file1 : list) {
            result.add("文件名："+file1.getName()+"\t文件大小"+file1.length());
        }
        return result;
    }
}
