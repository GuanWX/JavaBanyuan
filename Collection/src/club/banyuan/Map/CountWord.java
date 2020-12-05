package club.banyuan.Map;

import java.util.LinkedHashMap;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/3 11:04 上午
 */
public class CountWord {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        String[] strs = str.split(" ");
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        for (String s :strs) {
            if (linkedHashMap.containsKey(s)){
                linkedHashMap.replace(s,linkedHashMap.get(s)+1);
            }else {
                linkedHashMap.put(s,1);
            }
        }
        System.out.println(linkedHashMap);
    }
}
