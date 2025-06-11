package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class FirstElementHavingLengthOf10_19 {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple",
                "orange","pineapple","berry",
                "Strawberry","papaya","blueberry","avacado","custard apple");

        String st=fruits.stream()
                .filter(str->str.length()>10)
                .findFirst()
                .orElseThrow(NoSuchElementException::new); // throwing exception if no element
        // with length greater than 10 exists.
        System.out.println(st);

    }
}
