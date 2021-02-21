package com.stream.examples;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindAllEvenNumberBetween1To5 {

	public static void main(String[] args) {

		IntConsumer pl = System.out::println;
		IntPredicate even = n-> n % 2 == 0;
		IntPredicate odd = n-> n % 2 != 0;

		// Find all even numbers between 1 to 5
		// Numbers between 1 to 5
		IntStream.range(1, 6).filter(even).forEach(pl);
		
		// OR
		
		System.out.println("*****");
		IntStream.of(1, 2, 3, 4, 5, 6).filter(odd).forEach(pl);
	}

}
