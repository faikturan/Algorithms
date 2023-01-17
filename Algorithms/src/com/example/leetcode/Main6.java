package com.example.leetcode;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Main6 {

    /*
    11. Container With Most Water
    LeetCode
     */
    public static void main(String[] args) {
       var height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    public static int maxArea(int[] height){
        int maximumArea = 0;
        int left = 0;
        int right = height.length - 1;
        int shorterLine = 0;
        int distance = 0;


        while (left < right ){
            shorterLine = Math.min(height[left], height[right]);
            distance = right - left;
            maximumArea = Math.max(maximumArea, shorterLine * distance);
            System.out.println("left : " + height[left] + "  right :" +height[right] + "  shorterLine : " +shorterLine +
                    "  distance  : " +distance + "  MaximumArea :" +maximumArea);
            if (height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }

        return maximumArea;
    }

}