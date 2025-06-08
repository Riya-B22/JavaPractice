package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringIntTheList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"apple", "anar",
                "orange", "pineapple",
                "Strawberry","kiwi","berry","kiwi");

        Optional<String> longestString= fruits.stream()
                .min(Comparator.comparing(String::length).reversed());
        longestString.ifPresent(System.out::println);
    }
}
