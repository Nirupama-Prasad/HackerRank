package com.company;
import java.io.*;
import java.util.*;

public class HR_Str_1 {


    public void run() {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int result = A.length() + B.length();
        System.out.println(result);
        int lex = A.compareTo(B);
        if (lex < 0)
            System.out.println("No");
        else
            System.out.println("Yes");
        A = title(A);
        B = title(B);
        String S = A + " " +B;
        System.out.println(S);
    }

    public static String title(String string) {
        String r = "";
        for (int i = 0; i < string.length(); i++) {
            String next = string.substring(i, i + 1);
            if (i == 0) {
                r += next.toUpperCase();
            } else {
                r += next.toLowerCase();
            }
        }
        return r;
    }
}