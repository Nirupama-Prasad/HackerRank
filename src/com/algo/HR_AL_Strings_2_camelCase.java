package com.algo;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_AL_Strings_2_camelCase {

    static int camelcase(String s) {
        // Complete this function
        int count = 1;
        for (int i = 0; i <s.length(); i++) {
            if (s.isEmpty())
                return 0;
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
        }
        return count;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result = camelcase(s);
        System.out.println(result);
        in.close();
    }
}
