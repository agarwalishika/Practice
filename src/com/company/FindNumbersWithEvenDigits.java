package com.company;

public class FindNumbersWithEvenDigits {
    public int findNumbers(int[] nums) {
        int numEven = 0;
        for (int i = 0; i < nums.length; i++) {
            numEven += (getNumDigits(nums[i]) % 2 == 0) ? 1 : 0;
        }

        return numEven;
    }

    public int getNumDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }

        return count;
    }
}
