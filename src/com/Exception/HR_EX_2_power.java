package com.Exception;

import java.util.*;
import java.util.Scanner;

public class HR_EX_2_power {
    class MyCalculator {
        /*
         * Create the method long power(int, int) here.
         */
        public int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            } else if ((p == 0)||(n == 0)) {
                throw new Exception("n and p should not be zero.");
            } else if (p==1){
                return n;
            }else{
                return n * power(n, p - 1);
            }
        }
    }

    public final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    public void run() {

        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
