package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Main21 {
    /*
     1. Two Sum
     LeetCode
     */
    public static void main(String[] args) {
        var nums = new int[]{2, 7, 11, 15};
        var nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        var nums3 = new int[]{1};

        System.out.println(twoSum(nums, 9));

    }

    public static int[] twoSum(int[] nums, int target) {
        /*for (int i = 0; i < nums.length; i++){
            for (int j = i +1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        throw new IllegalStateException("no pair found");*/

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            Integer kalan = target - nums[i];
            if (indexMap.containsKey(kalan)) {
                return new int[] {indexMap.get(kalan), i};
            }
            indexMap.put(nums[i], i );
        }

        throw new IllegalStateException("no pair found");

    }

}
