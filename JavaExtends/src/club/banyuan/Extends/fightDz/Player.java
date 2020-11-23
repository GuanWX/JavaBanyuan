package club.banyuan.Extends.fightDz;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 3:31 下午
 */
public class Player {
    private String name;
    private boolean isBoos;
    private String[] jokers = new String[17];

    public Player(String name, boolean isBoos) {
        this.name = name;
        this.isBoos = isBoos;
        if (isBoos){
            jokers = new String[20];
        }
    }

    public String[] addJoker(String[] JokerAll){
        for (int i = 0; i < jokers.length; i++) {
            jokers[i]=JokerAll[JokerAll.length-i-1];
        }
        JokerAll = Arrays.copyOf(JokerAll,JokerAll.length-jokers.length);
        return JokerAll;
    }

    public String[] getJokers() {
        return jokers;
    }
}
