package com.company;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;

public class HR_str_4_if_palindrome {
    public void run() {
        //Given a string , print Yes if it is a palindrome, print No otherwise.
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        boolean flag = true;
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length();
        //System.out.println(length);
        int half = (int)((length/2)+1);
        for (int i =0; i<half;i++){
            String S1 = A.substring(i,i+1);
            String S2 = A.substring(length-i-1,length-i);
            if((S1.compareTo(S2))!=0){
                System.out.println("///");
                flag = false;
            }
        }
        if(flag==true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
