package com.stream.examples;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindAllNumberGreaterThan2 {

	public static void main(String[] args) {

		IntConsumer pl = System.out::println;
		IntPredicate pr = n-> n > 2;
		// Find all numbers greater than 2
		IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).forEach(System.out::println);
		IntStream.of(1, 2, 3, 4, 5).filter(pr).forEach(pl);
	}

}
