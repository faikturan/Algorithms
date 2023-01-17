package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Main11 {

    /*
    169. Majority Element
    LeetCode
     */
    public static void main(String[] args) {
       var nums = new int[]{1, 4, 7, 8, 7, 8, 8, 8, 2, 5};
        System.out.println(majorityElement2(nums));

    }
    public static int majorityElement2(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;

        for(int i:nums){

            //if hashmap does not contain the specific key
            if(!map.containsKey(i)){
                map.put(i,1);
            }

            //if it does contain the specific key,increase its count/value by 1
            else{
                map.put(i,map.get(i)+1);
            }

            //if the value of a specific key hai reached n/2 value,then return
            if(map.get(i)>n/2){
                return i;
            }
        }
        return 0;
    }
    public static int majorityElement(int[] nums) {
       int count = 0;
       int max = 0;

       for (int i : nums){
           if (count == 0){
               max = i;
           }

           if (i == max){
               count++;
           }else{
               count--;
           }
       }
       return max;
    }
}