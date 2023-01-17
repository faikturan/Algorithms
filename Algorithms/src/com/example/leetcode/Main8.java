package com.example.leetcode;

public class Main8 {

    /*
    121. Best Time to Buy and Sell Stock
    LeetCode
     */
    public static void main(String[] args) {
       int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        var min = Integer.MAX_VALUE;
        var max = 0;

        for (var i = 0; i < prices.length; i++)
        {
            if (prices[i] < min){
                min = prices[i];
            }else{
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }

}