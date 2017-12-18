package com.company;

import java.util.Scanner;
import java.util.regex.*;
public class HR_Str_7_Regex_check {
    public void run(){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            //Write your code
            try{
                Pattern P = Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
