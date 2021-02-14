package com.company;

/*
https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] num, int n) {
        int[] shuffled = new int[num.length];
        int i = 0;
        int j = n;
        for (int k = 0; k < num.length; k += 2) {
            shuffled[k] = num[i++];
            shuffled[k + 1] = num[j++];
        }

        return shuffled;
    }
}
