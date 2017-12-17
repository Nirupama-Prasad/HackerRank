package com.company;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;
public class HR_str_3_Lex_greatest_smallest_substring {

        //Lexicographically greatest and smallest substring
        public static String getSmallestAndLargest(String s, int k) {
            char[] chars = new char[k];
            Arrays.fill(chars, 'z');
            String smallest = new String(chars);
            Arrays.fill(chars, 'A');
            String largest = new String(chars);
            String s1,s2;

            for(int i=0;i<(s.length()- k + 1);i++){
                s1 = s.substring(i, i + k);
                System.out.println(s1);
                if(s1.compareTo(smallest) < 0){
                    smallest = s1;
                    System.out.println("smallest is " + smallest);
                }

                if(s1.compareTo(largest) > 0){
                    largest = s1;
                    System.out.println("largest is " + largest);
                }
            }
            s1 = "AAA";
            s2 = "wel";
            System.out.println(s1.compareTo(s2));
            return smallest + "\n" + largest;
        }

        public void run() {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();
            System.out.println(getSmallestAndLargest(s,k));
        }
    }
