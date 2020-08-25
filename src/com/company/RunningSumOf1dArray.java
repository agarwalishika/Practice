package com.company;

/*
https://leetcode.com/problems/running-sum-of-1d-array/
 */

public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int[] sums = new int[nums.length];

        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

        return sums;
    }
}
