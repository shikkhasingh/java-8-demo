package com.demo;

import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;

public class Demo1 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(" run method with annonymous implementation");
            }
        };

        Runnable r1 = () -> System.out.println(" run method with lambda function");

        Thread t = new Thread(r1);
        t.start();

//        Runnable r1 = () -> System.out.println(" #### first lambda ####");


        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };

        Comparator<String> comp1 = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
        Comparator<String> comp2 = String::compareTo;

        List<String> list = Arrays.asList("abc","a","ab");

        Collections.sort(list, comp1);

        for(String str: list){
            System.out.println(str);
        }

        Consumer<String> pr = (value) -> System.out.println(value);
//        Consumer<String> pr1 = System.out::println;

        list.forEach(pr);


        IntSupplier intSupplier = () -> (int)(Math.random() * 10);
        // orElseGet method - Return the value if present, otherwise return other
        System.out.println("optionalInt.orElseGet: " + OptionalInt.empty().orElseGet(intSupplier));


        IntConsumer pl = System.out::println;
        IntPredicate pr1 = n -> n > 2;
        // Find all numbers greater than 2
//        IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).forEach(System.out::println);
        IntStream.of(1, 2, 3, 4, 5).filter(pr1).forEach(pl);

        IntBinaryOperator binAdd = (a, b) -> a+b;
        IntBinaryOperator add =  Integer::sum;
        int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(10, binAdd);
//        int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(10, add);
        System.out.println("Sum of all between 1 to 5 and added 10 to that: " + reduce);

        IntPredicate even = n-> n % 2 == 0;
        IntPredicate pr2 = n-> n > 2;

        // Find all even numbers greater than 2
        IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).filter(n-> n % 2 == 0).forEach(System.out::println);
        IntStream.of(1, 2, 3, 4, 5).filter(pr2).filter(even).forEach(pl);
        IntStream.of(1, 2, 3, 4, 5).filter(pr2.and(even)).forEach(pl);

        Function<Integer, Integer> multiply = (value) -> value * 2;
        Function<Integer, Integer> add3 = (value) -> value + 3;

        Function<Integer, Integer> addThenMultiply = multiply.compose(add3);
        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add3);

        Integer result1 = addThenMultiply.apply(3);
        System.out.println(result1);
        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result2);

        System.out.println("Use reduce() method - to calculate sum of int in IntStream");

        IntBinaryOperator add2 = Integer::sum;

        // reduce() method will reduce stream to calculate sum of Integers in IntStream
		OptionalInt optionalInt = IntStream.of(1, 2, 3, 4, 5)
                .map(x -> x * 2 )
                .filter(x -> x % 3 == 0)
                .reduce((i1, i2) -> i1 + i2);
//        OptionalInt optionalInt = IntStream.of(1, 2, 3, 4, 5).reduce(add2);
        //Display optionalInt
        System.out.println("Sum = " + optionalInt.getAsInt());


    }
}
