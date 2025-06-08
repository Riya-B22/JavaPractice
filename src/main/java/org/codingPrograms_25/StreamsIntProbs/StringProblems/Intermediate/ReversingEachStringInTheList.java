package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReversingEachStringInTheList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"sky", "anar",
                "orange", "pineapple",
                "try","cry","kiwi");
        //my solution:
//        List<StringBuilder> reversedStringList = fruits
//                                                .stream()
//                                                .map(StringBuilder::new)
//                                                .map(StringBuilder::reverse)
//                                                .collect(Collectors.toList());
//        System.out.println(reversedStringList);

//        Shristi Tech academy solution similar (similar to mine only :P)
        fruits.stream()
                .map(str->new StringBuffer(str).reverse())
                .forEach(System.out::println);

    }
}
