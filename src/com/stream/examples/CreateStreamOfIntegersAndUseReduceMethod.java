package com.stream.examples;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class CreateStreamOfIntegersAndUseReduceMethod {

	public static void main(String[] args) {

		System.out.println("Create stream of integers.");
		Stream<Integer> streamOfIntegers = Stream.of(1, 2, 3, 4);
		
		System.out.println("Use reduce() method - to calculate sum of integers");

		BinaryOperator<Integer> add = Integer::sum;
		
		// reduce() method will reduce stream to calculate sum of integers
//		Optional<Integer> optionalInteger = streamOfIntegers.reduce((i1, i2)-> i1 + i2);
		Optional<Integer> optionalInteger = streamOfIntegers.reduce(add);

		// Display optionalInteger
		System.out.println("Sum: " + optionalInteger.get());
	}

}
