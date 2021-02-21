package com.stream.examples;

import java.util.OptionalInt;
import java.util.function.IntSupplier;

public class HowToUseOptionalIntInJava {

	public static void main(String[] args) {

		OptionalInt optionalInt = OptionalInt.of(5);

		//isPresent() will return true - If a value is present
		System.out.println("optionalInt.isPresent(): " + optionalInt.isPresent());

		// orElse method - Return the value if present, otherwise return other
		System.out.println("optionalInt.orElse: " + optionalInt.orElse(6));

		IntSupplier intSupplier = () -> (int)(Math.random() * 10);

		// orElseGet method - Return the value if present, otherwise return other
		System.out.println("optionalInt.orElseGet: " + OptionalInt.empty().orElseGet(intSupplier));


		System.out.println("\n1. optionalInt.ifPresent");
		//ifPresent method - If a value is present, it invokes the specified consumer with the value, otherwise do nothing
		optionalInt.ifPresent(System.out::println);

		System.out.println("\n2 - optionalInt.ifPresent");
        // Display some custom message if value is present
        optionalInt.ifPresent((i) -> System.out.println("value = " + i)); // value = 5

	}

}
