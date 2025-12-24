package org.codingPrograms_25.StreamsIntProbs.ArrayProblems.Basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//tough

public class SortInDescendingOrder {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(12,67,86,53,11,90,82,86,25);
        nums.stream()
//                .sorted((a,b)-> b-a) //Comparator w orks with List of objects not list of primitive values
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .forEach(System.out::println);

        System.out.println("\n " +
                "int array sorting");
        int[] numsArray= {12,67,86,53,11,90,82,86,25};
        Arrays.stream(numsArray)
//                .sorted() // works for ascending order
//                for descending order need to do following (or using map() to convert primitive data type to respective Object class):
                .mapToObj(num->Integer.valueOf(num))
//                or
//                .boxed() // converts the primitive type Array to wrapper class , Compartor works on List of objects not on List of  primitive types
                .sorted((a,b)->b-a)
                .forEach(System.out::println);
    }
}
