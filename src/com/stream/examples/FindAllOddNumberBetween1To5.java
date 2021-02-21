package com.stream.examples;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindAllOddNumberBetween1To5 {

	public static void main(String[] args) {

		IntConsumer pl = System.out::println;
		IntPredicate pr = n-> n % 2 == 1;

		// Find all odd numbers between 1 to 5
		IntStream.of(1, 2, 3, 4, 5).filter(n-> n % 2 == 1).forEach(System.out::println);
		IntStream.of(1, 2, 3, 4, 5).filter(pr).forEach(pl);
	}

}
