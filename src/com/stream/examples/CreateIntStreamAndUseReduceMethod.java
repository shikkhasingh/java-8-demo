package com.stream.examples;

import java.util.OptionalInt;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class CreateIntStreamAndUseReduceMethod {

	public static void main(String[] args) {

		System.out.println("Create IntStream:");
		IntStream streamOfIntegers = IntStream.of(1, 2, 3, 4);
		
		System.out.println("Use reduce() method - to calculate sum of int in IntStream");

		IntBinaryOperator add = Integer::sum;
		
		// reduce() method will reduce stream to calculate sum of Integers in IntStream
//		OptionalInt optionalInt = streamOfIntegers.reduce((i1, i2) -> i1 + i2);
		OptionalInt optionalInt = streamOfIntegers.reduce(add);

		//Display optionalInt
		System.out.println("Sum = " + optionalInt.getAsInt());
	}

}
