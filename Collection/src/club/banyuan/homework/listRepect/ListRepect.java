package club.banyuan.homework.listRepect;

import club.banyuan.homework.randNumber.ObjectRepeatException;
import java.util.ArrayList;


/**
 * @author edz
 * @version 1.0
 * @date 2020/12/1 8:08 下午
 */
public class ListRepect {

    public static void check(ArrayList<?> arrayList, Object s) throws RuntimeException{
        for (Object value : arrayList) {
            if (value.equals(s)) {
                throw new ObjectRepeatException(s+" has existed！");
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        String [] strings1 = {"aaa","bbb","aaa","abc","xyz","123","xyz"};
        for (String s :strings1) {
            try{
                check(strings,s);
                strings.add(s);
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(strings);

    }
}
