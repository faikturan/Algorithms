package com.example.leetcode;

import java.util.HashSet;

public class Main9 {

    /*
    217. Contains Duplicate
    LeetCode
     */
    public static void main(String[] args) {
       int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        var set = new HashSet<>();

        for (var i: nums) {
            if (set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }

}