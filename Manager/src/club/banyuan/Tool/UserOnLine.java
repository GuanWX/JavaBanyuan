package club.banyuan.Tool;

import java.util.HashMap;
import java.util.Map;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/15 4:00 下午
 */
public class UserOnLine {
    public static Map<String, String> userOnLine = new HashMap<>();

    public Map<String, String> getUserOnLine() {
        return userOnLine;
    }
    public static boolean Status(String hostname){
        if (userOnLine==null || userOnLine.size()==0){
            return false;
        }
        return userOnLine.containsKey(hostname);
    }
}
