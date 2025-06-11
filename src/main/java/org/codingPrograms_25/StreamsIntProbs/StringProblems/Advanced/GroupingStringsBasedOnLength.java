package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStringsBasedOnLength {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple",
                "orange","pineapple","berry",
                "Strawberry","papaya","blueberry","avacado");
//        Map<Integer, List<String>> groupedStrings =
                fruits.stream().collect(Collectors.groupingBy(String::length))
                        .forEach((keyLength,listStr)-> System.out.println("length-> "+keyLength+
                                " "+listStr));


    }

}
