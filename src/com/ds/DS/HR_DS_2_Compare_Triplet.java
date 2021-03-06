package com.ds.DS;

import java.util.*;

public class HR_DS_2_Compare_Triplet {
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] a = {a0,a1,a2};
        int[] b = {b0,b1,b2};
        int[] result = {0,0};
        for (int i = 0; i < 3; i++) {
            if(a[i]>b[i]){
                result[0]+=1;
            }else if(b[i]>a[i]){
                result[1]+=1;
            }
        }
        return result;
    }
    public void run() {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
}
