package com.ds;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_DS_6_List {

    public void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int flag = 0;
        //int k;
        List<Integer> L = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            L.add(scan.nextInt());
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String Op = scan.next();
            Op = Op.toLowerCase();
            //System.out.println(Op);
            if (Op.compareTo("insert")==0){
                int x = scan.nextInt();
                int y = scan.nextInt();
                if(x<0||x>L.size()){
                    System.out.println("Error");
                }
                L.add(x,y);
            }else if(Op.compareTo("delete")==0){
                int x = scan.nextInt();
                L.remove(x);
                flag++;

            }else{
                System.out.println("Error");
            }
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i)+" ");
        }
    }
}
