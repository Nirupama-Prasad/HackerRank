package com.algo;

import java.util.*;

public class HR_AL_Strings_3_make_t {
//String  always consists of two distinct alternating characters.
// For example, if string 's two distinct characters are x and y,
// then t could be xyxyx or yxyxy but not xxyy or xyyx.
    public String delete_adjacent(String S) {
        HashSet<Character> set_repeating_chars = new HashSet<Character>();

        for (int i = 0; i < S.length() - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                set_repeating_chars.add(S.charAt(i));
            }
        }
        String N = "";
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(!set_repeating_chars.contains(c)){
                N += c;
            }
        }
        return N;
    }
    
    public String delete_lowest(String S){
        HashMap<Character, Integer> map_count_chars = new HashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            
            boolean exists = map_count_chars.containsKey(c);
            if(exists){
                int count = map_count_chars.get(c);
                map_count_chars.put(c, ++count);
            }
            else{
                map_count_chars.put(c, 1);
            }
        }

        int smallest_count = Integer.MAX_VALUE;
        char smallest_char = ' ';
        Iterator it = map_count_chars.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            char key = (char) pair.getKey();
            int value = (int) pair.getValue();

            if(value < smallest_count){
                smallest_count = value;
                smallest_char = key;
            }
        }

        String N = "";
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) != smallest_char){
                N += S.charAt(i);
            }
        }
        return N;
    }

    public boolean qualifies(String S){
        if (S.length() == 0 || S.length() == 1){
            return true;
        }
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < S.length() - 1; i++) {
                set.add(S.charAt(i));
        }

        if(set.size() != 2){
            return false;
        }else{
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i-1) == S.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

    }

    public int twoCharaters() {
        //Scanner s = new Scanner(System.in);
        //int n = s.nextInt();
        String S = "muqqzbcjmyknwlmlcfqjujabwtekovkwsfjrwmswqfurtpahkdyqdttizqbkrsmfpxchbjrbvcunogcvragjxivasdykamtkinxpgasmwz";
        String N = "";
        String D = "";
        
        while(true) {
            if (qualifies(S)) {
                if (S.length() == 0) {
                    return 0;
                } else {
                    return S.length();
                }
            } else {
                N = delete_adjacent(S);
                System.out.println(N);
                if (!qualifies(N)) {
                    S = delete_lowest(N);
                    System.out.println(S);
                } else {
                    if (N.length() == 0) {
                        return 0;
                    } else {
                        return N.length();
                    }
                }

            }
        }
        

    }
    
    public void run(){
        HashSet<Character> hs = new HashSet<Character>();
        int l = twoCharaters();
        System.out.println(l);
        
    }
}
