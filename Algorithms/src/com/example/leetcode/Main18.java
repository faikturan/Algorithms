package com.example.leetcode;

public class Main18 {
    /*
     153. Find Minimum in Rotated Sorted Array
     LeetCode
     */
    public static void main(String[] args) {
         var nums = new int[]{3, 4, 5, 1, 2};
         var nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
         var nums3 = new int[]{11, 13, 15, 17};

        System.out.println(findMin(nums3));

    }

    public static int findMin(int[] nums) {
        var left = 0;
        var right = nums.length - 1;

        while (left < right)
        {
            var middle = left + (right - left) /2;

            if (nums[middle] > nums[right])
            {
                left = middle + 1;
            }
            else {
                right = middle;
            }
        }
        return nums[left];
    }

}
