package org.codingPrograms_25.StreamsIntProbs.StringProblems.CodeWithAmodProblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestOccurenceOfWordInAStringUsingJava8 {
    public static void main(String[] args) {
        String str= "hello hello hello hello world world world";
        Map<String, Long> collect = Stream.of(str.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream()
                .sorted(
                        Map.Entry.<String, Long>comparingByValue().reversed()
                )
                .skip(1)
                .findFirst().get();
        System.out.println(stringLongEntry);
    }
}
