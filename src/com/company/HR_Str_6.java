package com.company;
import java.io.*;
import java.util.*;

public class HR_Str_6 {
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
