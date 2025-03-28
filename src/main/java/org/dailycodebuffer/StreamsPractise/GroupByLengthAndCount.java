package org.dailycodebuffer.StreamsPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of strings, write a Java 8 Stream program
to group the strings by their length and count the number of strings in each group.
* */
public class GroupByLengthAndCount {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        Map<Integer,Long> counts=words.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(counts);
    }
}
