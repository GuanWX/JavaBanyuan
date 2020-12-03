package club.banyuan.homework_12_2.Team;

import java.util.ArrayList;
import java.util.List;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/2 6:25 下午
 */
public class Team {
    static List<Player> playersStarting = new ArrayList<>();
    static List<Player> playersSubstitute = new ArrayList<>();
    public static boolean deletePlayer(List<Player> list,Player player) throws RuntimeException{
        if (player==null || list==null || list.size()==0)
            throw new NullPointerException("Player or List is NULL!!");
        return list.remove(player);
    }
    public static boolean addPlayer(List<Player> list,Player player) throws RuntimeException{
        if (player==null){
            throw new NullPointerException("Player is NULL");
        }
        if (list.equals( playersStarting) && list.size()==5 ){
            throw new RuntimeException("playersStarting has full");
        }else if (list.equals( playersStarting)){
            for (Player player1 :playersStarting) {
                if (player1.getRole().equals(player.getRole())){
                    throw new RuntimeException(player.getRole().getDes()+" has exited!");
                }
            }

        }

        return list.add(player);
    }
    public static boolean change(Player player) throws RuntimeException{
        if (!playersSubstitute.contains(player)){
            throw new RuntimeException(player.getName()+" don't in the playersSubstitute");
        }
        for (Player player1 :playersStarting) {
            if (player1.getRole().equals(player.getRole())){
                deletePlayer(playersStarting,player1);
                addPlayer(playersSubstitute,player1);
                deletePlayer(playersSubstitute,player);
                addPlayer(playersStarting,player);
                return true;
            }
        }
        deletePlayer(playersSubstitute,player);
        addPlayer(playersStarting,player);
        return true;
    }
    public static boolean adjust(List<Player> list){
        for (Player player :list) {
                change(player);
        }
        return true;
    }
    public static void show(){
        for (Player player :playersStarting) {
            System.out.print(player+"\t");
        }
        if (playersStarting.size()<5){
            System.out.println("\n首发阵容不完整");
        }else{
            System.out.println("\n首发阵容完整，此次定能大破曹军");
        }
        for (int i = 0; i < playersSubstitute.size(); i++) {
            if (i%5==0){
                System.out.println();
            }
            System.out.print(playersSubstitute.get(i)+"\t");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Player player1 = new Player("A",1,Role.PG);
        Player player2 = new Player("B",2,Role.SG);
        Player player3 = new Player("C",3,Role.SF);
        Player player4 = new Player("D",4,Role.PF);
        Player player5 = new Player("E",5,Role.C);
        Player player6 = new Player("F",6,Role.PG);
        Player player7 = new Player("G",7,Role.SG);
        Player player8 = new Player("H",8,Role.SF);
        Player player9 = new Player("I",9,Role.PF);
        Player player10 = new Player("J",10,Role.C);
        Player player11 = new Player("A2",11,Role.PG);
        Player player12 = new Player("B2",12,Role.SG);
        Player player13 = new Player("C2",13,Role.SF);
        Player player14 = new Player("D2",14,Role.PF);
        Player player15 = new Player("E2",15,Role.C);
        Player player16 = new Player("F2",16,Role.PG);
        Player player17 = new Player("G2",17,Role.SG);
        Player player18 = new Player("H2",18,Role.SF);
        Player player19 = new Player("I2",19,Role.PF);
        Player player110 = new Player("J2",20,Role.C);
        try {
            addPlayer(playersStarting,player1);
            addPlayer(playersStarting,player2);
            addPlayer(playersStarting,player3);
            addPlayer(playersStarting,player4);
            addPlayer(playersStarting,player5);
            addPlayer(playersSubstitute,player6);
            addPlayer(playersSubstitute,player7);
            addPlayer(playersSubstitute,player8);
            addPlayer(playersSubstitute,player9);
            addPlayer(playersSubstitute,player10);
            addPlayer(playersSubstitute,player11);
            addPlayer(playersSubstitute,player12);
            addPlayer(playersSubstitute,player13);
            addPlayer(playersSubstitute,player14);
            addPlayer(playersSubstitute,player15);
            addPlayer(playersSubstitute,player16);
            addPlayer(playersSubstitute,player17);
            addPlayer(playersSubstitute,player18);
            addPlayer(playersSubstitute,player19);
            addPlayer(playersSubstitute,player110);
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        show();
        try {
            List list = new ArrayList();
            list.add(player6);
            list.add(player11);

            adjust(list);
        }catch (RuntimeException e){
            System.err.println(e.getMessage());
        }
        show();
    }
}
