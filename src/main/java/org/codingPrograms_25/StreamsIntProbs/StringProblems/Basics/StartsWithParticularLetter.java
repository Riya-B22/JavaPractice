package org.codingPrograms_25.StreamsIntProbs.StringProblems.Basics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//First element in the list that  starts with the particular letter
public class StartsWithParticularLetter {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"apple", "anar",
                "orange", "pineapple",
                 "Strawberry","kiwi","berry","kiwi");
        Optional<String> firstElement = fruits
                .stream()
                .filter(str -> str.startsWith("z"))
                .findFirst(); // returns an optional value,optional is like container-can or cannot have value
        // Optional Throws noSuchElementException if value is not present.
        firstElement.ifPresent(System.out::println);
    }
}
