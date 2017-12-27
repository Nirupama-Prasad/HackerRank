package com.BigNumber;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.*;

public class HR_BI_1 {

    public void run() {
        Scanner scan = new Scanner(System.in);
        BigInteger bi1 = scan.nextBigInteger();
        BigInteger bi2 = scan.nextBigInteger();
        BigInteger S = bi1.add(bi2);
        BigInteger P = bi1.multiply(bi2);
        System.out.println(S);
        System.out.println(P);
    }
}
