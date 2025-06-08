package org.codingPrograms_25.StreamsIntProbs.StringProblems.Basics;

import java.util.Arrays;
import java.util.List;

public class LengthOfEachStringInTheList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"apple", "anar",
                "orange", "pineapple",
                "Strawberry","kiwi","berry","kiwi");
      fruits.stream()
                .map(String::length)
                .forEach(System.out::println); // return
    }
}
