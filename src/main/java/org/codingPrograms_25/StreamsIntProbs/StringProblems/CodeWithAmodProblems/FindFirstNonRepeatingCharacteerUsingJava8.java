package org.codingPrograms_25.StreamsIntProbs.StringProblems.CodeWithAmodProblems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacteerUsingJava8 {
    public static void main(String[] args) {
        String str="aabbc";
        Character c1 = str.chars()//to convert the string into intStream
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),//to iterate each word one by one
                        LinkedHashMap::new,//preserve the order
                        Collectors.counting()

                ))// returns  a hashmap
                .entrySet() //Converts the Map into a Set of entries. Each entry looks like a=2, b=2, c=1.
                .stream() //Starts a new stream of these Entry objects so you can filter them.
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(c1);
    }
}
