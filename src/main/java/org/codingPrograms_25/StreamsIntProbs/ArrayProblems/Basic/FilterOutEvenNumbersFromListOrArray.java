package org.codingPrograms_25.StreamsIntProbs.ArrayProblems.Basic;

import java.util.Arrays;
import java.util.List;

public class FilterOutEvenNumbersFromListOrArray {
    public static void main(String[] args) {
//        way 1:
        List<Integer> nums= Arrays.asList(10,24,25,21,86,95,100);
        nums.stream().filter(i->i%2==0)
                .forEach(System.out::println);

//        way 2
        int[] numsArr= {10,24,25,21,86,95,100};
        Arrays.stream(numsArr).filter(i->i%2==0)
                .forEach(System.out::println);

    }
}
