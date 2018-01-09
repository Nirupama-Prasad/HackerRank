package com.algo;

import java.util.*;

public class HR_AL_Strings_1_super_reduced {
    static String super_reduced_string(String s){
        String R = s;
        String N = "";
        String O;
        while(true) {
            O = N;
            N = "";
            //System.out.println("Old: " + O );
            for (int i = 0; i < s.length(); ) {
                //System.out.println(s.charAt(i));
                if (i == s.length() - 1) {
                    N += s.charAt(i);
                    break;
                }

                if (s.charAt(i) == s.charAt(i + 1)) {
                    i += 2;
                } else {
                    N += s.charAt(i);
                    i++;
                }
            }
            s = N;

            if (O.equals(N)){
                break;
            }
        }


        return N;
    }
    public void run() {
        //aabcddc
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
