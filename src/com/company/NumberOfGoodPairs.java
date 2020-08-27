package com.company;

/*
https://leetcode.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
