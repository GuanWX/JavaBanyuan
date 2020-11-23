package club.banyuan.Extends.fightDz;

import java.util.Arrays;

/**
 * @author edz
 * @version 1.0
 * @date 2020/11/23 3:39 下午
 */
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("A",true);
        Player player2 = new Player("B",false);
        Player player3 = new Player("C",false);

        Joker  joker  = new Joker();
        joker.newJoker();
        joker.randomJoker();
        String [] jokers = joker.getJokers();
        jokers = player1.addJoker(jokers);
        jokers = player2.addJoker(jokers);
        jokers = player3.addJoker(jokers);

        System.out.println(Arrays.toString(player1.getJokers()));
        System.out.println(Arrays.toString(player2.getJokers()));
        System.out.println(Arrays.toString(player3.getJokers()));
    }


}
