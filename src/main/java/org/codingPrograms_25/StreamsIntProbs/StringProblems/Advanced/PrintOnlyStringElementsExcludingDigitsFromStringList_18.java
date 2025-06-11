package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// TOUGH
// print only the elements from the list that consists of characters not digits
public class PrintOnlyStringElementsExcludingDigitsFromStringList_18 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","12345","123",
                "berry","hello88","kiwi", "44Fly");


        words.stream()
                .filter(str -> !str.matches(".*[0-9].*"))
                .forEach(System.out::println);


    }
}
