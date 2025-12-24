package org.codingPrograms_25.StreamsIntProbs.ArrayProblems.Basic;

import java.util.stream.IntStream;
// tough
public class OddEvenNumberBetweenARange {
    public static void main(String[] args) {
        System.out.println("Even numbers");
        IntStream.rangeClosed(10,100) // use RangeClosed for including the limits; use Range for excluding the start and end.
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("\n Odd numbers");
        IntStream.rangeClosed(10,100)
                .filter(i->i%2!=0)
                .forEach(System.out::println);
    }
}
