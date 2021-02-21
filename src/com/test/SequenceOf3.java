package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SequenceOf3 {
    public static int findcount(String str){
        int count =0;
        char [] s = str.toCharArray();

        for (int i =0; i<str.length(); i++ ){
            for (int j = i+1; j<str.length(); j++ ) {
                for (int k = j+1; k<str.length(); k++ ) {
                    String a = String.valueOf(s[i]);
                    String b = String.valueOf(s[j]);
                    String c = String.valueOf(s[k]);
                    if(!a.equals(b) && !b.equals(c) && !c.equals(a)) {
                        System.out.println(a+b+c);
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        System.out.println("################"+ findcount("abcabc"));

    }
}

