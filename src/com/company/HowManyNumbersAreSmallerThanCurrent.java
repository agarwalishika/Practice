package com.company;

/*
https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class HowManyNumbersAreSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] mins = new int[nums.length];
        for (int i = 0; i < nums.length; i+=1){
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    mins[i]++;
                }
            }
        }

        return mins;
    }
}
