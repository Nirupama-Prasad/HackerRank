package com.ds;

import java.util.*;

public class HR_DS_5_ArrayGame {
//    You're standing at index  of an -element array named . From some index (where ), you can perform one of the following moves:
//
//    Move Backward: If cell  exists and contains a , you can walk back to cell .
//    Move Forward:
//    If cell  contains a zero, you can walk to cell .
//    If cell  contains a zero, you can jump to cell .
//    If you're standing in cell  or the value of , you can walk or jump off the end of the array and win the game.

        public static boolean canWin(int index, int leap, int[] game) {
            //System.out.println("Checking index: " + index);
            if(index == game.length-1 || index+leap > game.length-1){
                return true;
            }

            if(index < 0){
                return false;
            }
            if(game[index] == 1){
                return false;
            }

            game[index] = 1;

            Boolean p1 = canWin(index - 1, leap, game);
            Boolean p2 = canWin(index + 1, leap, game);
            Boolean p3 = canWin(index + leap, leap, game);

            return p1 || p2 || p3;
        }

        public void run() {
//            Scanner scan = new Scanner(System.in);
//            int q = scan.nextInt();
//            while (q--> 0) {
//                int n = scan.nextInt();
//                int leap = scan.nextInt();
//
//                int[] game = new int[n];
//                for (int i = 0; i < n; i++) {
//                    game[i] = scan.nextInt();
//                }
//                System.out.println( (canWin(0, leap, game)) ? "YES" : "NO" );
//            }
//            scan.close();
            int leap = 3;
            int[] game = {0,0,0,0,0};
            Boolean result = canWin(1, leap, game);
            System.out.println(result);

        }
}

//
//    // Return true if you can win the game; otherwise, return false.
//    int i = 0,largest = 0;
//    boolean flag = false;
//            for (int j = 0; j < game.length; j++) {
//        if(game[j]==0){
//        i=0;
//        }
//        else if(game[j]==1){
//        i++;
//        if(i>largest){
//        largest = i;
//        }
//        }
//        }
//        if(leap<=largest){
//        return false;
//        }else{
//        return true;
//        }