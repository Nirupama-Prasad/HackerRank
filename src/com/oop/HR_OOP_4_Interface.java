package com.oop;

import java.util.*;

public class HR_OOP_4_Interface {
    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }
    class MyCalculator implements AdvancedArithmetic{
        @Override
        public int divisor_sum(int n){
            int sum = 1;
            for(int i=n/2;i>0;i--){
                if (n%i==0)
                    sum = sum + (n/i);
            }
            return sum;
        }
    }
    public void run() {
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
