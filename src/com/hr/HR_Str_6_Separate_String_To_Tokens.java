package com.hr;
import java.util.*;
//https://www.hackerrank.com/challenges/java-string-tokens/problem
//Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

public class HR_Str_6_Separate_String_To_Tokens {
    public void run() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        String sep = "[,;:!'_ ]";
        String[] S = s.split(sep);
        ArrayList<String> R = new ArrayList<String>();
        int count = 0;
        for (String si : S){
            if (si != " " && si != "" && !si.isEmpty() && si != null){
                R.add(si);
            }
        }
        System.out.println(R.size());
        for (String each : R) {
            System.out.println(each);
        }
    }
}
