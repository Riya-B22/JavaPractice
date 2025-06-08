package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringsIntoASingleStringSeparatedByCommas {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"sky", "anar",
                "orange", "pineapple",
                "try","cry","berry","kiwi");
        String output = fruits
                .stream()
                .collect(Collectors.joining(","));
        System.out.println(output);
    }
}
