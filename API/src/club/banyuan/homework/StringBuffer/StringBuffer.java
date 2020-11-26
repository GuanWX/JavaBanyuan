package club.banyuan.homework.StringBuffer;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/26 8:18 下午
 */
public class StringBuffer {
    private String value = "";

    public StringBuffer() {
    }

    public StringBuffer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void append(String str){
        value=value+str;
    }
    public void append(char c){
        char [] chars = value.toCharArray();
        chars = Arrays.copyOf(chars,chars.length+1);
        chars[chars.length-1]=c;
        value= new String(chars);
    }

    @Override
    public String toString(){
        return value;
    }
    public void clear(){
        value="";
    }
    public String reverse(){
        char [] chars=value.toCharArray();
        char [] rev = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            rev[i]=chars[chars.length-i-1];
        }
         return new String(rev);
    }
    public String reverse(int form ,int to){
        String str=value.substring(form,to);
        String strF=value.substring(0,form);
        String strE=value.substring(to);
        StringBuffer temp = new StringBuffer();
        temp.value=str;
        return strF+temp.reverse()+strE;
    }

}
class Test{
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("abcdefg");
        stringBuffer.append("hi");
        stringBuffer.append('j');
        System.out.println(stringBuffer.toString());
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.reverse(0,2));
        System.out.println(stringBuffer.reverse(1,5));
    }
}
