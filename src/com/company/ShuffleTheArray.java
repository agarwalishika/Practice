package com.company;

/*
https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        int i = 0;
        int j = n;
        for (int k = 0; k < nums.length; k += 2) {
            shuffled[k] = nums[i++];
            shuffled[k + 1] = nums[j++];
        }

        return shuffled;
    }
}
