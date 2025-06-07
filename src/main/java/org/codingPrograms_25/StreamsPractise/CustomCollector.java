package org.codingPrograms_25.StreamsPractise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of strings, write a Java 8 Stream program to concatenate
all the strings into a single string, separated by a comma.
* */
public class CustomCollector {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        String joinedString = words.stream().collect(Collectors.joining(","));
        System.out.println(joinedString);
    }
}
