package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLastCharacter_16 {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple",
                "orange","pineapple","berry",
                "Strawberry","papaya","blueberry","avacado");
        /* create a map where the key is the last letter of the string, and the value is a list of
        strings that end with that letter using streams */
        Map<Character, List<String>> mapwords    =
                fruits.stream()
                 .collect(Collectors.groupingBy(str->str.charAt(str.length()-1)));

        mapwords.forEach((key,liststr)->{
            System.out.println(key+" \t " +liststr);
        });
    }
}
