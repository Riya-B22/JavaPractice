package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.util.Arrays;
import java.util.List;

public class RemoveEmptyOrNullStringsFromTheList {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("apple","","pineapple",null,"strawberry",
                null,"","null");
        // my solution:
        System.out.println("\nsolution 1\n");
        words.stream()
                .filter(i-> !(i==null||i.isEmpty()))
                .forEach(System.out::println);
        // Shristi academy solution:
        System.out.println("\nsolution 2");
        // my solution:
        words.stream()
                .filter(i-> i!=null && !i.isEmpty())
                .forEach(System.out::println);

    }
}
