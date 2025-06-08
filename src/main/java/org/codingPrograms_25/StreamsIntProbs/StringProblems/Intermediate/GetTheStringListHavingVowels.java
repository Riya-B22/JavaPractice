package org.codingPrograms_25.StreamsIntProbs.StringProblems.Intermediate;

import java.util.Arrays;
import java.util.List;

public class GetTheStringListHavingVowels {
    static boolean hasVowel(String s){
        s=s.toLowerCase();
        if(s.contains("a")|| s.contains("e")||s.contains("i")||s.contains("o")||
                s.contains("u")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("berry" ,"sky", "anar",
                "orange", "pineapple",
                "try","cry","berry","kiwi");
        fruits.stream()
//                .filter(GetTheStringListHavingVowels::hasVowel)
                .filter(str->str.matches(".*[aeiou].*"))
                .sorted()
                .forEach(System.out::println);
    }
}
