package com.ds;

import sun.net.www.content.text.Generic;

import java.util.*;

import java.io.IOException;
import java.lang.reflect.Method;

public class HR_DS_10_Generics {
    class Printer{
        public <T> void printArray(T[] arr){
            for(T item:arr){
                System.out.print(item);
            }
        }
        }

    public void run() {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");

    }
}
