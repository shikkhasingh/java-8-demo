package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GCD {
    public static int generalizedGCD(int num, int[] arr)
    {
        int gcd = 0;
        int r = 0;
        List<Integer> intArr = new ArrayList<Integer>();
        for(int k =0; k<num; k++){
            intArr.add(arr[k]);
        }
        Collections.sort(intArr);
        for(int i =1; i<=arr[num-1]; i++){
            for(int j =0; j<num; j++){
                r = r + intArr.get(j)%i;
            }
            if(r==0) gcd = i;
        }
        return gcd;
    }

    public static List<Integer> cellCompete(int[] states, int days)
    {
        List<Integer> intArr = new ArrayList<Integer>();
        List<ListNode> intArr1 = new ArrayList<ListNode>();

        ListNode<Integer> next = null;
        ListNode<Integer> prev = null;

        for(int i=0; i<8; i++){
            ListNode nd =  new ListNode(prev, states[i], next);
            intArr1.add(nd);
            if(prev !=null){
                prev.next = nd;
            }
            prev = nd;
        }
//        for (ListNode listNode11 : intArr1) {
//            System.out.println("########## listNode11 : " + listNode11);
//        }
        System.out.println("\n\n");
//        23280720376361
        for (int d =0; d<days; d++) {
            for (ListNode listNode : intArr1) {
                if (listNode.prev == null) {
                    if (listNode.next.data.equals(0)) listNode.data = 0;
                    else listNode.data = 1;
//                    System.out.println("########## 1 : " + listNode);
                } else if (listNode.next == null) {
                    if (listNode.prev.data.equals(0)) listNode.data = 0;
                    else listNode.data = 1;
//                    System.out.println("########## 2 : " + listNode);
                } else {
                    System.out.println("########## 23 : " + listNode);
                    if (listNode.next.data.equals(listNode.prev.data)) listNode.data = 0;
                    else listNode.data = 1;
                    System.out.println("########## 3 : " + listNode);
                }
            }
        }

        for (ListNode listNode1 : intArr1) {
            intArr.add((Integer) listNode1.data);
        }

        return intArr;
    }

    public static void main(String[] args) {

       // System.out.println("########## generalizedGCD : "+generalizedGCD(5, new int[]{2,4,10,8,6}));
        System.out.println("########## cellCompete : "+cellCompete(new int[]{1,0,0,0,0,1,0,0}, 1));

    }
}


//23280666857778
//23280666857778

class ListNode<Integer> {
    Integer data;
    ListNode<Integer> next;
    ListNode<Integer> prev;
    ListNode(Integer data) {
        this(null, data, null);
    }

    ListNode(ListNode<Integer> prev, Integer data, ListNode<Integer> next) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "data=" + data +
                ", next=" + (next==null?0: next.data)+
                ", prev=" + (prev==null?0: prev.data)+
                '}';
    }
}