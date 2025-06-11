package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsBasedOnFirstLetterInAList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("apple",
                "orange","pineapple","berry",
                "Strawberry","papaya","blueberry","avacado");
        // collect used for joining,converting back to list/set , also now we see for grouping
        // it is being used

        // map will be returned where key will be first letter, and value will be list of
        // strings starting with that letter.
        Map<Character,List<String>> mapwords    =
                                     fruits.stream()
                                    .collect(Collectors.groupingBy(str->str.charAt(0)));
        mapwords.forEach((key,liststr)->{
            System.out.println(key+" \t " +liststr);
//            liststr.forEach(System.out::println);
        });

    }
}
