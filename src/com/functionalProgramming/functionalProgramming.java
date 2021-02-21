package com.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class functionalProgramming {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        // using imperative style of coding
        int result = 0;
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                result += n * 2;
            }
        }
        System.out.println(result);

        // using declarative style of coding
         System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());
        // closure
        int factor = 2;
        System.out.println(
                numbers.stream()
                        .filter(number -> number % 2 == 0)
                        .mapToInt(e -> e * factor)
                        .sum());
    }
}
