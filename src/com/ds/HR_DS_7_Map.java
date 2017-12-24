package com.ds;

import java.util.*;

public class HR_DS_7_Map {

    public void run() {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,String> map=new HashMap<String,String>();
        for(int i=0;i<n;i++)
        {
            String name = in.nextLine();
            String phone = in.next();
            in.nextLine();
            map.put(name,phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(map.get(s)!=null){
                System.out.println(s+" = "+map.get(s));
            }else{
                System.out.println("Not Found");
            }
        }

    }
}
