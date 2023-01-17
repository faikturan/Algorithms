package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {

/*
268. Missing Number
LeetCode
 */
    public static void main(String[] args) {

        var nums = new int[]{0,2,3,1,5};
        System.out.println(missingNumber((nums)));

    }

    public static int missingNumber(int[] nums){
        int n = nums.length;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0; i<n; i++){
            hashSet.add(nums[i]);
        }

        for (int i = 0; i<n; i++){
            if(!hashSet.contains(i)){
                return i;
            }
        }

        return n;
    }

   /* public static int missingNumber(int[] nums){
        int sum = 0;
        int n = nums.length;
        for (int num: nums) {
            sum += num;
        }
        return (n * (n + 1)) / 2 - sum;
    }*/

}