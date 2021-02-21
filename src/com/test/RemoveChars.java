package com.test;

public class RemoveChars {
    public static String remove(String str1, String str2){
        StringBuffer output = new StringBuffer("");

        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        boolean isAppend = true;

        for (char c1 : s1) {
            for (char c2 : s2) {
                if(String.valueOf(c1).equals(String.valueOf(c2))) {
                    isAppend=false;
                }
            }
            if(isAppend) output.append(c1);
            isAppend = true;
        }


        return output.toString();


    }

    public static void main(String[] args) {
        System.out.println("###### Remove : " + remove("geeksforgeeks", "mask"));
    }
}
