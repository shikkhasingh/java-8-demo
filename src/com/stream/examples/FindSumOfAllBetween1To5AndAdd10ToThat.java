package com.stream.examples;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class FindSumOfAllBetween1To5AndAdd10ToThat {

	public static void main(String[] args) {

		// find sum of all between 1 to 5 and add 10 to that
		IntBinaryOperator binAdd = (a, b) -> a+b;
		int reduce = IntStream.of(1, 2, 3, 4, 5).reduce(10, binAdd);
		System.out.println("Sum of all between 1 to 5 and added 10 to that: " + reduce);

		IntBinaryOperator add =  Integer::sum;

		int reduce1 = IntStream.of(1, 2, 3, 4, 5).reduce(10, add);
		System.out.println("Sum of all between 1 to 5 and added 10 to that: " + reduce1);
	}
}
