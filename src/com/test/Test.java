package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {



    public static int times(int size) {
        if(size==0)
            return 1;
        else{
            return 10 * times(size-1);
        }
    }

    public static void main(String[] args) {

        System.out.println("###########");

        int i=10;
        int j=0;
        String num = "6987";
        int min = Integer.parseInt(num);
        List numArray = new ArrayList(){};
        int x = 0;
        do{
           x = min%10;
           numArray.add(x);
           min=min/10;
        }while(min>0);

        Collections.sort(numArray);
        Collections.reverse(numArray);

        System.out.println(numArray);
        x = 0;
        int size= numArray.size();
        for (j=0; j<numArray.size(); j++, size--){
         x = x + (Integer) numArray.get(j) * times(size-1);
        }

        System.out.println(x);

//        for(int j=0; j<=i; j++){
//            if(j%2==0) System.out.println("result : " + j);
//        }
//        while(j%2==0){
//            System.out.println("result : " + j);
//            j++;
//        }
//        do{
//            System.out.println("result : " + j);
//            j++;
//        }while(j%2==0);
        System.out.println("###########");
    }
}
