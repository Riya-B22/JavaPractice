package org.codingPrograms_25.StreamsIntProbs.StringProblems.CodeWithAmodProblems;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingCharacterWithCountInJava8 {

    public static void main(String[] args) {
        String str="programming";
        Map<Object, Object> collect = str.chars()// converted to IntStream
//                .forEach(System.out::println);
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting() // taking the original character and counting
                )).entrySet()//In Java, you cannot stream a Map directly; you have to stream its "entries" (the key- value pairs)
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(collect);

    }

}
