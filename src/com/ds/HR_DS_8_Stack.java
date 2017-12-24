package com.ds;

import java.util.*;

public class HR_DS_8_Stack {

    public boolean isLeft(char c){
        if (c == '{' || c == '(' || c == '['){
            return true;
        }
        return false;
    }

    public boolean check_braces(String s){
        HashMap<Character, Character> mc = new HashMap<Character, Character>();
        mc.put('}', '{');
        mc.put(']', '[');
        mc.put(')', '(');

        Stack<Character> S = new Stack<Character>();
        boolean ret = false;
        char[] sc = s.toCharArray();
        for (char c : sc) {
            if(isLeft(c)){
                //System.out.println("Pushing" + c);
                S.push(c);
            }
            else{

                Character r = mc.get(c);
                if(S.isEmpty()){
                    return false;
                }
                Character p = S.pop();
                //System.out.println("Popping" + p);
                if (r != p){
                    return false;
                }
            }
        }
        if(S.isEmpty())
            return true;
        else
            return false;
    }

    public void run() {

        Scanner sc = new Scanner(System.in);
        Stack<Character> S = new Stack<>();
        Stack<Character> S2 = new Stack<>();
        boolean flag = false;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        int size;
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(check_braces(input));
        }

    }
}
