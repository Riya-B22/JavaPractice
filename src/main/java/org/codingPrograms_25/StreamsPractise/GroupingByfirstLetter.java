package org.codingPrograms_25.StreamsPractise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
Given a list of strings,
write a Java 8 Stream program to group the strings by their first letter.
* */
public class GroupingByfirstLetter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");
        Map<Character, List<String>> groupedWords = words.stream().collect(Collectors.groupingBy(c -> c.charAt(0)));
        System.out.println(groupedWords);

    }
}
