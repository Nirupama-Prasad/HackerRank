package com.ds;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_DS_14_Bitset {

    public void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet bits1 = new BitSet(n);
        BitSet bits2 = new BitSet(n);

        // set some bits
        for(int i = 0; i < m; i++) {
            String Op = scan.next();
            int operand1 = scan.nextInt();
            int operand2 = scan.nextInt();
            switch (Op){
                case "AND":
                    if ((operand1 ==1)&&(operand2==2))
                        bits1.and(bits2);

                    else
                        bits2.and(bits1);
                    break;
                case "OR":
                    if ((operand1 ==1)&&(operand2==2))
                        bits1.or(bits2);
                    else
                        bits2.or(bits1);
                    break;
                case  "XOR":
                    if ((operand1 ==1)&&(operand2==2))
                        bits1.xor(bits2);
                    else
                        bits2.xor(bits1);
                    break;
                case "FLIP":
                    if (operand1 == 1)
                        bits1.flip(operand2);
                    else
                        bits2.flip(operand2);
                    break;
                case  "SET":
                    if (operand1 == 1)
                        bits1.set(operand2);
                    else
                        bits2.set(operand2);
                    break;
                default:
                    break;
            }
            System.out.print(bits1.cardinality()+"  "+ bits2.cardinality());
            System.out.println();
        }


    }
}
