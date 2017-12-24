package com.ds;

import java.util.*;

public class HR_DS_9_Hashset {

    public void run() {
        HashSet<String> h = new HashSet<String>();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        boolean Added;

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i]+" "+pair_right[i];
            Added = h.add(pair);
            System.out.println(pair);
            if(Added){
                count++;
                System.out.println(count);
            }else{
                System.out.println(count);
            }
        }
    }
}
