package org.codingPrograms_25.StreamsPractise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);

        // Finding the second-largest number
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Remove duplicates (if any)
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the first (largest) element
                .findFirst(); // Get the second element

        // Printing the result
        secondLargest.ifPresent(System.out::println);
    }
}
