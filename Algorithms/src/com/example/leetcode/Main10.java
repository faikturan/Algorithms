package com.example.leetcode;

import java.util.HashSet;

public class Main10 {

    /*
    263. Ugly Number
    LeetCode
     */
    public static void main(String[] args) {
        int n = 140;
        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) {
        for(int i = 2; i<6&&n>0;i++){
            while (n%i==0)
                n/=i;
        }
        if (n==1)
            return true;
        return false;

    }

}