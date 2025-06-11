package org.codingPrograms_25.StreamsIntProbs.StringProblems.Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class groupingByPresenceOfVowels_17 {
    public static void main(String[] args) {
        /*Going to use static method called partioningBy  of Collectors class,
        used to partition the list of values into two categories
        * */
        Predicate<String> pred= str-> str.matches(".*[aeiou].*");
        List<String> fruits= Arrays.asList("cry",
                "sky","try","myth",
                "Strawberry","papaya","blueberry","avacado");

        Map<Boolean,List<String>> mapwords=
                fruits.stream().collect(Collectors.partitioningBy(pred));
//        way 1:
        mapwords.forEach((key,list)-> System.out.println(key+"\t "+list));
//        way 2:
        System.out.println("With Vowels "+mapwords.get(true));
        System.out.println("Without Vowels "+mapwords.get(false));
    }
}
