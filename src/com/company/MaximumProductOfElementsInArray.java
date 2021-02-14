package com.company;

import java.util.ArrayList;

public class MaximumProductOfElementsInArray {
    public static int maxProduct(int[] nums) {
        int maxOne = findMaxIndexExcluding(nums, -1);
        System.out.println("maxone:" + maxOne);
        int maxTwo = findMaxIndexExcluding(nums, maxOne);
        System.out.println("maxtwo:" + maxTwo);

        return (nums[maxOne] - 1) * (nums[maxTwo] - 1);
    }

    public static int findMaxIndexExcluding(int[] nums, int index) {
        int maxI = 0;
        int max = 0;
        System.out.println("Index of:: " + index);
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < nums[i]) {
                maxI = i;
                max = nums[i];
            }
        }

        return maxI;
    }

    public static void main(String[] args) {
        int[] x = {10, 2, 5, 2};
        maxProduct(x);


    }
}
