package com.company;

/*
https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for (int i = 0; i < nums.length; i += 2) {
            len += nums[i];
        }

        int[] list = new int[len];
        int counter = 0;
        for (int i = 0; i < nums.length && counter < list.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++){
                list[counter] = val;
                counter++;
            }
        }

        return list;
    }
}
