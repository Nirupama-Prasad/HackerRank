package com.ds;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_DS_2_hourglass_largest_sum {
    public void run(){
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int largest =-100 , sum, i1=-1,j1=-1;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if((i<4)&&(j<4)) {
                    sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                    if (sum > largest) {
                        largest = sum;
                    }
                }
            }

        }

            System.out.println(largest);

    }
}
