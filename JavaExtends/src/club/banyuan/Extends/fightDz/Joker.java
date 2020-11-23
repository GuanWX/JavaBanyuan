package club.banyuan.Extends.fightDz;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 3:32 下午
 */
public class Joker {
    private final String[] str1 = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private final String[] str2 = {"♠","♥","♣️","♦️"};
    String[] jokers = new String[54];

    public void newJoker(){
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                jokers[i*4+j]=str2[j]+str1[i];
            }
        }
        jokers[52]="小王";
        jokers[53]="大王";
    }
    public void randomJoker(){
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
    }

    public String[] getJokers() {
        return jokers;
    }
}
