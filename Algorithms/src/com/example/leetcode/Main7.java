package com.example.leetcode;

public class Main7 {

    /*
    7. Reverse Integer
    LeetCode
     */
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x){
        long reserved = 0;
        int lastDigit = 0;
        while (x != 0){
            lastDigit = x % 10;
            reserved = reserved * 10 + lastDigit;
            x /= 10;
            if (reserved > Integer.MAX_VALUE || reserved < Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)reserved;
    }

}