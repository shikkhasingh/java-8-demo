package com.test;

public class Factorial {

    public static int FirstFactorial(int num) {
        if(num==0 || num ==1) return 1;
        else return num * FirstFactorial(num-1);
    }

    public static void main(String[] args) {

        System.out.println("########## FirstFactorial : "+FirstFactorial(8));

    }
}
