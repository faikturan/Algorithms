package com.example.leetcode;

public class Main19 {
    /*
     33. Search in Rotated Sorted Array
     LeetCode
     */
    public static void main(String[] args) {
        var nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        var nums2 = new int[]{4, 5, 6, 7, 0, 1, 2};
        var nums3 = new int[]{1};

        System.out.println(search(nums, 0));


    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] > nums[right]) {
                left = midpoint + 1;
            } else {
                right = midpoint;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[start] && target <= nums[right]) {
            left = start;
        } else {
            right = start;
        }

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            if (nums[midpoint] == target){
                return midpoint;
            } else if (nums[midpoint] < target) {
                left = midpoint + 1;
            }else{
                right = midpoint - 1;
            }
        }
        return -1;
    }

}
