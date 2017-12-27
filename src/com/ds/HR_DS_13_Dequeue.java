package com.ds;

import java.util.*;

public class HR_DS_13_Dequeue {

    public void run() {
        int n = 6, m = 3;
        int[] arr  = {5, 3, 5 , 2, 3, 2};
        Deque deque = new ArrayDeque<Integer>(n);
        HashSet<Integer> s = new HashSet<Integer>();
        int max_count = 0;
        for (int i = 0; i < n; i++) {
            deque.add(arr[i]);
            if (deque.size() == m) {
                System.out.println(deque.toString());
                Iterator it = deque.iterator();
                while(it.hasNext()){
                    s.add((int)it.next());
                }
                if(s.size() > max_count) max_count = s.size();
                if(max_count == m){
                    break;
                }
                deque.pop();
            }
        }
        System.out.println("Max unique elements" + max_count);

    }
}
