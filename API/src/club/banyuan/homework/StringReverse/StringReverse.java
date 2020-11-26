package club.banyuan.homework.StringReverse;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/26 8:50 下午
 */
public class StringReverse {
    public static void main(String[] args) {
        String str = "To be or not to be";
        String [] strs =str.split(" ");
        System.out.println(Arrays.toString(strs));
        str ="";
        String temp =null;
        for (int i = 0; i < strs.length; i++) {
            temp=reverse(strs[i]);
            str=str+temp+" ";
        }

        System.out.println(str);
    }
    public static String reverse(String str){
        char [] chars = str.toCharArray();
        char [] charres = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charres[i]=chars[chars.length-i-1];
        }
        return new String(charres);
    }

}
