package com.example.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Main4 {


    public static void main(String[] args) {

        String[] input = {"aaa",
        "bbb",
        "ccc",
        "booking",
        "alpha",
        "beta",
        "gamma"};
        System.out.println(solve(input, "booking", 3));
        System.out.println(solve(input, "gamma", 3));
        System.out.println(solve(input, "bbb", 3));

    }

    public static List<String> solve(String[] input, String word, int k){
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList());
        int wordIndex = inputList.indexOf(word);
        if (wordIndex < 0){
            System.out.println(word + " not found");
            return new ArrayList<>();
        }
        if (wordIndex - k < 0 ){
            return inputList.subList(0, wordIndex + 1);
        }
        return inputList.subList(wordIndex - k, wordIndex + 1);
    }

}