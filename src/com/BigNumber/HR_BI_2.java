package com.BigNumber;

import java.math.BigDecimal;
import java.util.*;

public class HR_BI_2 {

    public void run() {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
