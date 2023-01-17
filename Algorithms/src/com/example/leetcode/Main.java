package com.example.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /**
     * You have three Arrays.
     * A = {2, 5, 3, 2, 8, 1}
     * B = {7, 9, 5, 2, 4, 10, 10}
     * C = {6, 7, 5, 5, 3, 7}
     *
     * s1 = A & B
     * s2 = A & C
     * s3 = B & C
     *
     * result = s(s1 + s2 + s3)
     * make an array from this three arrays which elements is present in at least two array.
     *
     * This question was followed by instead of three arrays. If you have a list of array then what will be solution?
     * Also, what will be the time complexity?
     * @param args
     */

    static void presentTwoElements(int[] A, int[] B, int[] C){
        List<Integer> AA = Arrays.stream(A).boxed().collect(Collectors.toList());
        List<Integer> BB = Arrays.stream(B).boxed().collect(Collectors.toList());
        List<Integer> CC = Arrays.stream(C).boxed().collect(Collectors.toList());

        Set<Integer> result = Stream.of(AA, BB, CC).flatMap(Collection::stream)
                                             .filter(x -> (AA.contains(x) && BB.contains(x)) ||
                                                      (AA.contains(x) && CC.contains(x)) ||
                                                      (BB.contains(x) && CC.contains(x)))
                                                        .collect(Collectors.toSet());
        System.out.println(result);


    }
    public static void main(String[] args) {
        int[] A = {2, 5, 3, 2, 8, 1};
        int[] B = {7, 9, 5, 2, 4, 10, 10};
        int[] C = {6, 7, 5, 5, 3, 7};

        presentTwoElements(A, B, C);
    }
}