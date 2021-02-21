package com.functionalProgramming;

import java.util.function.*;

public class SixBasicFunctionalInterfaces {

	public static void main(String[] input) {

		consumerExample("Welcome to functional interface tutorial");

		System.out.println("Supplier Example = " + supplierExample());

		System.out.println("Predicate Example = " + predicateExample(10));

		System.out.println("BinaryOperator Example = " + binaryOperatorExample(11,20));

		System.out.println("UnaryOperator Example = " + unaryOperatorExample(12));

		System.out.println("Function Example = " + functionExample(17));
	}

	private static void consumerExample(String text) {

		Consumer<String> consumer= i-> System.out.println("Consumer Example = "+i);
		consumer.accept(text);
	}

	private static Double supplierExample() {

		Supplier<Double> randomValue = () -> Math.random();
		return randomValue.get();
	}

	private static Boolean predicateExample(Integer num) {

		Predicate<Integer> lesserthan = i -> (i < 18);
		return lesserthan.test(num);
	}
	
	private static Integer binaryOperatorExample(Integer num1, Integer num2) {

		BinaryOperator<Integer> sumOfSquare = (a, b) -> a * a + b * b;
		return sumOfSquare.apply(num1, num2);

	}

	
	private static Integer unaryOperatorExample(Integer num) {

		UnaryOperator<Integer> multiplyByTwo = x -> x * 2;
		return multiplyByTwo.apply(num);
	}
	
	private static Double functionExample(Integer num) {

		Function<Integer, Double> half = a -> a / 2.0;
		return half.apply(num);
		
	}

}

