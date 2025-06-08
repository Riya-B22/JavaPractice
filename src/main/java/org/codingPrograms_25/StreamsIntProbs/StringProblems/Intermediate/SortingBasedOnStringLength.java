package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingBasedOnStringLength {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"apple", "anar",
                "orange", "pineapple",
                "Strawberry","kiwi","berry","kiwi");

        fruits.stream()
//                .sorted((a,b)->a.length()-b.length())
//                .sorted((a,b)->((Integer)a.length()).compareTo(b.length())) //compareTo is SAM of comparable interface
                //inbuilt method of comparator interface
//                .sorted(Comparator.comparing(String::length))//static method
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
