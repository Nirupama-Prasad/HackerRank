package com.oop;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR_OOP_1_Inheritance_1 {
    class Animal{
        void walk(){
            System.out.println("I am walking");
        }
    }
    class Bird extends Animal{
        void fly(){
            System.out.println("I am flying");
        }
        void sing(){
            System.out.println("I am singing");
        }
    }


    public void run() {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}
