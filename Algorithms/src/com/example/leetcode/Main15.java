package com.example.leetcode;

public class Main15 {
    /*
     238. Product of Array Except Self
     LeetCode
     */
    public static void main(String[] args) {
         var nums = new int[]{1,2,3,4};
        System.out.print(productExceptSelf(nums));

    }

    public static int[] productExceptSelf(int[] nums) {

        var n = nums.length;
        var left = new int[n];
        var right = new int[n];
        var result = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (var i = 1; i < n; i++)
        {
            left[i] = left[i- 1] * nums[i - 1];
        }

        for (var i = n - 2; i>=0; i--)
        {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for(var i = 0; i < n; i++)
        {
            result[i] = left[i] * right[i];
        }

        return result;

    }

}
