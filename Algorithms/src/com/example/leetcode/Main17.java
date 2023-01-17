package com.example.leetcode;

public class Main17 {
    /*
     152. Maximum Product Subarray
     LeetCode
     */
    public static void main(String[] args) {
         var nums = new int[]{2,3,-2,4};
        System.out.println(maxProduct(nums));


    }

    public static int maxProduct(int[] nums) {

        var max = nums[0];
        var currMin = nums[0];
        var currMax = nums[0];

        for (var i = 1; i < nums.length; i++)
        {
            var tempCurrMax = nums[i] * currMax;
         currMax = Math.max(nums[i], Math.max(nums[i] * currMax, nums[i] * currMin));
         currMin = Math.min(nums[i], Math.min(tempCurrMax, nums[i] * currMin));

         max = Math.max(max, currMax);
        }
        return max;
    }

}
