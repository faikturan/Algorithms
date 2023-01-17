package com.example.leetcode;

import java.util.Map;

public class Main16 {
    /*
     53. Maximum Subarray
     LeetCode
     */
    public static void main(String[] args) {
         var nums = new int[]{1,2,3,4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {

        var currSum = nums[0];
        var maxSum = nums[0];

        for (var i = 1; i < nums.length; i++){
            currSum = Math.max(nums[i], nums[i] + currSum);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

}
