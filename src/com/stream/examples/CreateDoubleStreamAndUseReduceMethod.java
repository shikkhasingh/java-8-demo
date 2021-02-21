package com.stream.examples;

import java.util.OptionalDouble;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.DoubleStream;

public class CreateDoubleStreamAndUseReduceMethod {

	public static void main(String[] args) {
		
		System.out.println("Create DoubleStream:");
		DoubleStream streamOfDoubles = DoubleStream.of(1.1, 2.2, 3.3);
		
		System.out.println("Use reduce() method - to calculate sum of double in DoubleStream");

		DoubleBinaryOperator add = Double::sum;
		
		// reduce() method will reduce stream to calculate sum of Doubles in DoubleStream
//		OptionalDouble optionalDouble = streamOfDoubles.reduce((i1, i2) -> i1 + i2);
		OptionalDouble optionalDouble = streamOfDoubles.reduce(add);
		
		//Display optionalDouble
		System.out.println("Sum = " + optionalDouble.getAsDouble());
	}

}
