package com.ds;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.lang.*;

public class HR_DS_3_contiguous_sub_array {

    public static int[] get_sub_array(int start, int end, int[] in){
        int[] out;
        out = Arrays.copyOfRange(in, start, end+1);
        return out;
    }

    public static int get_subarray_count(int[] in){
        int count = 0;
        for(int i = 0; i < in.length; i++){
            for (int j = 0; j <= in.length - i - 1; j++){
                int[] temp = get_sub_array(j, j + i, in);
                int sum = 0;
                for(int k = 0; k < temp.length; k++){
                    sum += temp[k];
                }
                if(sum < 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] convertIntegers(ArrayList<Integer> integers){
        int[] ret = new int[integers.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }

    public static void rmain() {
        Scanner in = new Scanner(System.in);
        int nElements = Integer.parseInt(in.nextLine());

        String s = in.nextLine();
        String[] ts = s.split(" ");
        ArrayList<Integer> inp = new ArrayList<Integer>(nElements);
        for (String each: ts){
            inp.add(Integer.parseInt(each));
        }

        System.out.println(get_subarray_count(convertIntegers(inp)));
    }



    public void run() {
        rmain();
        int[] test_array = {1, -2, 4, -5, 1};
        int count = get_subarray_count(test_array);
        System.out.println(count);
    }

}
