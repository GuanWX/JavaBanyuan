package club.banyuan.demo;

import java.util.Arrays;

/**
 * @author gwx
 * @version 1.0
 * @date 2020/11/13 下午2:19
 */
public class TestDemo {
    /**
     * 这个Demo的意义是用来写作业代码，没有特殊的含义，只是为了利用idea这个工具
     **/
    public static void main(String[] args) {
        String[] str1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] str2 = {"黑桃","红桃","梅花","方片"};
        String[] jokers = new String[54];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                jokers[i*4+j]=str2[j]+str1[i];
            }
        }
        jokers[52]="小王";
        jokers[53]="大王";
        System.out.println(Arrays.toString(jokers));
        double[] index = new double[54];
        double temp1;
        String temp2;
        for (int i = 0; i < index.length; i++) {
            index[i]=Math.random();
        }
        for (int i = 0; i < jokers.length-1; i++) {
            for (int j = 0; j < jokers.length-1-i; j++) {
                if (index[j]>index[j+1])
                {
                    temp1 = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp1;
                    temp2= jokers[j];
                    jokers[j] = jokers[j+1];
                    jokers[j+1] = temp2;
                }
            }
        }

        System.out.println(Arrays.toString(index));
        System.out.println(Arrays.toString(jokers));

    }
}
