package com.BigNumber;

import java.math.BigDecimal;
import java.util.*;

public class HR_BI_2 {

    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(y==0)
                throw  new ArithmeticException("/ by zero");
            else
                System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
