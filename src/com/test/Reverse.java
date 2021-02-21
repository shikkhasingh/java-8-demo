package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {


    static int minimumHours(int rows, int columns, List<List<Integer> > grid)
    {
        // WRITE YOUR CODE HERE
//        List<Integer> intArr = new ArrayList<Integer>();
//        List<ListNode> intArr1 = new ArrayList<ListNode>();

//        GridNode<Integer> next = null;
//        GridNode<Integer> prev = null;
//        GridNode<Integer> above = null;
//        GridNode<Integer> below = null;
        // Initalialise Grid


        for(int i=0; i<rows; i++){
            List<Integer> r= grid.get(1);
            Integer prev = null;
            Integer current = null;
            for(int j=0; j<columns; j++){
                current =  r.get(j);
                if(prev==current){

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        List<List<Integer> > grid = new ArrayList<>();
        List rows = new ArrayList<>();
        List r0 = new ArrayList<Integer>(Arrays.asList(1, 0, 0, 0));
        List r1 = new ArrayList<Integer>(Arrays.asList(1,0,0,0));
        List r2 = new ArrayList<Integer>(Arrays.asList(1,0,0,0));
        List r3 = new ArrayList<Integer>(Arrays.asList(1,0,0,0));
        grid.add(0, r0);
        grid.add(1, r1);
        grid.add(2, r2);
        grid.add(3, r3);
        System.out.println("############## FirstReverse : " + minimumHours(5, 4, grid));
    }

    class GridNode<Integer> {
        List<List<java.lang.Integer> > grid = new ArrayList<>();
        Integer data;
        GridNode<Integer> next;
        GridNode<Integer> prev;
        GridNode<Integer> above;
        GridNode<Integer> below;
        GridNode(Integer data) {
            this(null, data, null, null,null);
        }

        GridNode(GridNode<Integer> prev, Integer data, GridNode<Integer> next, GridNode<Integer> above, GridNode<Integer> below) {
            this.data = data;
            this.next = next;
            this.prev = prev;
            this.above = above;
            this.below = below;
        }

        boolean checkGrid(){
            boolean isUnit = false;
            for(int i=0; i<grid.size(); i++){

                List<java.lang.Integer> r= grid.get(1);
                for(int j=0; j<r.size(); j++){
                    if(r.get(j)==1) {
                        isUnit = true;
                    } else{
                        isUnit = false;
                    }

                }
            }
            return isUnit;
        }

        List<List<java.lang.Integer>> initialize( List<List<java.lang.Integer>> input ){

            for(int i=0; i<input.size(); i++){
                List<java.lang.Integer> nr= new ArrayList<>();
                List<java.lang.Integer> r= input.get(1);
                for(int j=0; j<r.size(); j++){
                    nr.add(r.get(i));
                }
                grid.add(nr);
            }
            return grid;
        }
    }
}
