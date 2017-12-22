package com.ds;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_DS_4_ArrayList {
    public void run(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[50];
        int d, q, x, y;
        ArrayList<ArrayList<Integer>> AL = new ArrayList<ArrayList<Integer>>(n);

        for (int i = 0; i < n; i++) {
            //System.out.println("Enter row: " + (i + 1) + " Enter no of elements");
            d = scan.nextInt();
            ArrayList<Integer> AY = new ArrayList<Integer>(d);
            for (int j = 0; j < d; j++) {
                AY.add(scan.nextInt());
            }
            AL.add(AY);
        }


        for (ArrayList<Integer> a : AL){
            for(int i : a){
                //System.out.print(i + "\t");
            }
            //System.out.println();
        }
        //System.out.println("Enter no of coordinates: ");
        q = scan.nextInt();

        ArrayList<ArrayList<Integer>> coords = new ArrayList<ArrayList<Integer>>(q);
        for (int i = 0; i < q; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(2);
            //System.out.println("Enter x: ");
            x = scan.nextInt();
            //System.out.println("Enter y:");
            y = scan.nextInt();
            temp.add(x);
            temp.add(y);
            coords.add(temp);

        }

        for (ArrayList<Integer> ai : coords) {
            int xx = ai.get(0);
            int yy = ai.get(1);
            try {
                System.out.println(AL.get(xx - 1).get(yy - 1));
            }
            catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
