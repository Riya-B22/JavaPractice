package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Tough
public class ConvertArrayOfStringIntoListAndReverse_20 {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple",
                "orange","pineapple","berry",
                "Strawberry","papaya","blueberry","avacado","custard apple");

        // we cant take fruits.stream() directly as elemnents will move in the forward direction,
        // like apple, orange, pineapple and so on

        // in stream API index starts with 1
        // so we'll make use of range:
        IntStream.range(0,fruits.size())// size=7
                .mapToObj(i->fruits.get(fruits.size()-1-i))// int primitive obj to convert to
                // string object need to use mapToObj and not map() directly
                .forEach(System.out::println);

    }
}
