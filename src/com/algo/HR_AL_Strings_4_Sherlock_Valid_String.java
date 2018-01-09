package com.algo;

import java.util.*;

public class HR_AL_Strings_4_Sherlock_Valid_String {
    public String isValid(String s){
        HashMap<Character,Integer> M = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if(M.containsKey(s.charAt(i)))
                M.put(s.charAt(i),M.get(s.charAt(i))+1);
            else
                M.put(s.charAt(i),1);
        }
        int largest = 0;
        HashMap<Integer,Integer> N = new HashMap<Integer, Integer>();
        Iterator it = M.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            int value = (int) pair.getValue();
            if(N.containsKey(value)) {
                System.out.println(N.containsKey(value));
                System.out.println(M.get(value));
                System.out.println(value);
                //N.put(value,M.get(value)+1);
            }
            else{
                N.put(value,1);
                System.out.println("-------------------");
                System.out.println(N.containsKey(value));
                System.out.println(M.get(value));
                System.out.println(value);
                //System.out.println("-------------------");
            }
        }
        Iterator it1 = N.entrySet().iterator();
        int most_com = 0, ct = 0;
        while (it1.hasNext()) {
            Map.Entry pair = (Map.Entry)it1.next();
            int key = (int) pair.getKey();
            int value = (int) pair.getValue();
            if(value>largest) {
                largest = value;
                most_com = key;
            }
        }

        Iterator it2 = M.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry pair = (Map.Entry)it2.next();
            int value = (int) pair.getValue();
            if(value!=most_com)
                ct++;
        }
        if(ct<2)
            return "YES";
        else
            return "NO";
    }
    public void run() {
        String s = "aabbcd";
        String result = isValid(s);
        System.out.println(result);
    }
}
