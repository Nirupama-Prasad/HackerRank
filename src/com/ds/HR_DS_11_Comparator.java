package com.ds;

import java.util.*;

public class HR_DS_11_Comparator {
    class Player {
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }

    }

    public class Checker implements Comparator<Player> {
        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score == o2.score){
                return o1.name.compareTo(o2.name);
            }
            else{
                return o2.score - o1.score;
            }
        }
    };

    public void run() {
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
        int n = 3;
        Player p1 = new Player("James", 100);
        Player p2 = new Player("John", 50);
        Player p3 = new Player("Anna", 50);
        Player[] player = new Player[n];
        Checker checker = new Checker();
        player[0] = p1;
        player[1] = p2;
        player[2] = p3;

//        for(int i = 0; i < n; i++){
//            player[i] = new Player(scan.next(), scan.nextInt());
//        }
//        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

}
