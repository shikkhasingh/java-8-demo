package com.stream.examples;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindAllEvenNumbersGreaterThan2 {

	public static void main(String[] args) {

		IntConsumer pl = System.out::println;
		IntPredicate pr1 = n-> n % 2 == 0;
		IntPredicate pr2 = n-> n > 2;

		// Find all even numbers greater than 2
		IntStream.of(1, 2, 3, 4, 5).filter(n-> n > 2).filter(n-> n % 2 == 0).forEach(System.out::println);
		IntStream.of(1, 2, 3, 4, 5).filter(pr2).filter(pr1).forEach(pl);
		IntStream.of(1, 2, 3, 4, 5).filter(pr2.and(pr1)).forEach(pl);
	}

}
