package com.stream.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class CreateStreamFilterDisplaySorting {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("ank");
		stringList.add("sam");
		stringList.add("az");
		stringList.add("neh");
		stringList.add("ad");
		
		Stream<String> stream = stringList.stream();

		Predicate<String> strA = (s1) -> s1.startsWith("a");
		Consumer<String> pl = System.out::println;
		Comparator<String> strComp = String::compareTo;

		// In one line display all records that start with 'a' in stream
		System.out.println("1. Use stream for filtering and display:");
//		stream.filter(s-> s.startsWith("a")).forEach(System.out::println);
		stream.filter(strA).forEach(pl);
		
		// OR
		stream = stringList.stream();
		System.out.println("2. Use stream for filtering and display:");
		stream.filter(strA).forEach(s-> System.out.println("Value = " + s));
		
		// OR
		stream = stringList.stream();
		System.out.println("3. Use stream for filtering and display:");
		stream.forEach(s-> {
			if(s.startsWith("a"))
				System.out.println(s);
		});
		
		
		// In one line display all record (in sorted manner - ASCENDING) that starts with "a" in the stream
		stream = stringList.stream();
		System.out.println("4. Use stream for filtering, sorting and display (in sorted manner - ASCENDING Order):");
		stream.filter(strA).sorted().forEach(pl);
		
		// In one line display all record (in sorted manner - DESCENDING) - by passing lambda expression that starts with "a" in the stream
		stream = stringList.stream();
		System.out.println("5. Use stream for filtering, sorting and display (in sorted manner - DESCENDING Order):");
		stream.filter(strA).sorted(strComp).forEach(pl);
		
		// In one line display all record (in sorted manner - DESCENDING) - using Comparator.reverseOrder() that starts with "a" in the stream
		stream = stringList.stream();
		System.out.println("6. Use stream for filtering, sorting and display (in sorted manner - DESCENDING Order):");
		stream.filter(strA).sorted(Comparator.reverseOrder()).forEach(pl);
		
		// In one line display all record (in sorted manner) in UPPERCASE that starts with 'a' in the stream
		UnaryOperator<String> strUpper = String::toUpperCase;
		stream = stringList.stream();
		System.out.println("7.Use stream for filtering, UPPERCASE conversion, sorting and display:");
		stream.filter(strA).map(strUpper).sorted().forEach(pl);
		
		// OR
		
		stream = stringList.stream();
		System.out.println("8.Use stream for filtering, UPPERCASE conversion, sorting and display:");
		stream.filter(strA).map(String::toUpperCase).sorted().forEach(pl);
	}
}
