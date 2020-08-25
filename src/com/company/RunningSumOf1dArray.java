package com.company;

/*
https://leetcode.com/problems/running-sum-of-1d-array/
 */

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            sums[i] = currSum;
        }

        return sums;
    }
}
