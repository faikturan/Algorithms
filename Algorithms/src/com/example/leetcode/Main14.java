package com.example.leetcode;

import java.util.HashSet;

public class Main14 {
    /*
     217. Contains Duplicate
     LeetCode
     */
    public static void main(String[] args) {
        var nums = new int[]{1, 1, 2};
        var nums2 = new int[]{0,0,1,1,1,2,2,3,3,4,5,5,5};

        System.out.println(removeDuplicates(nums));
        System.out.println(removeDuplicates(nums2));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }

        }

        return addIndex;
    }


    public static boolean check(int[] nums) {
        var set = new HashSet<Integer>();
        for (var i: nums) {
            if (set.contains(i))
            {
                return true;
            }
            else {
                set.add(i);
            }
        }
        return false;
    }
}
