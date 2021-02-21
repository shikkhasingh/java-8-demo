package com.test;

import java.util.Collections;
import java.util.List;

public class Search {
    public static int SearchElement(String input, String fStr){

        String [] arr = input.split(" ");
        int count = 0;
        for (String str: arr) {
            if(str.equals(fStr))  count++;
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println("###########  elements :  " + SearchElement("the a there answer any by bye their", "the"));
    }
}
