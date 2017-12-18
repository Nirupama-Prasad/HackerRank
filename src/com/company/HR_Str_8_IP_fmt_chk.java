package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class MyRegex {

    MyRegex(){
        String zeroto255 = "(\\d{1,2}|(0|1)\\d{1,2}|2[0-4]\\d|25[0,5])";
        pattern =  zeroto255 + "\\." + zeroto255 + "\\." + zeroto255 + "\\." + zeroto255;
        System.out.println(pattern);
    }

    public String pattern;
//[0-2][0-5][0-5]\.[0-2][0-5][0-5]\.[0-2][0-5][0-5]\.[[0-2][0-5][0-5]
}

public class HR_Str_8_IP_fmt_chk {
    //Write a class called MyRegex which will contain a string pattern.
    //You need to write a regular expression and assign it to the pattern
    // such that it can be used to validate an IP address. Use the following
    // definition of an IP address:
    public void run(){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
