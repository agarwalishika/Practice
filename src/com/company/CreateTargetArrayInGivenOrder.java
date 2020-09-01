package com.company;

public class CreateTargetArrayInGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] list = new int[nums.length];
        for (int i = 0; i < list.length; i++) {
            list[i] = -1;
        }

        for (int i = 0; i < index.length; i++) {
            int curr = index[i];
            if (list[curr] != -1) {
                shiftAt(list, curr);
            }
            list[curr] = nums[i];
        }

        return list;
    }

    public void shiftAt(int[] nums, int ith) {
        for (int i = nums.length - 1; i > ith; i--) {
            nums[i] = nums[i - 1];
        }
    }
}
