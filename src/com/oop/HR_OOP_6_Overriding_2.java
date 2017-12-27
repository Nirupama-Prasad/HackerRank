package com.oop;

import java.util.*;
import java.io.*;

public class HR_OOP_6_Overriding_2 {
    class BiCycle{
        String define_me(){
            return "a vehicle with pedals.";
        }
    }

    class MotorCycle extends BiCycle{
        String define_me(){
            return "a cycle with an engine.";
        }

        MotorCycle(){
            System.out.println("Hello I am a motorcycle, I am "+ define_me());
            String temp=super.define_me(); //Fix this line
            System.out.println("My ancestor is a cycle who is "+ temp );
        }

    }
    public void run() {
        MotorCycle M=new MotorCycle();
    }
}
