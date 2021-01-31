package com.company;

public class totalGain {
    public int largestAltitude(int[] gains) {
        int max = 0;
        int total = 0;

        for (int i = 0; i < gains.length; i++) {
            total += gains[i];
            if (total > max) {
                max = total;
            }
        }

        return max;
    }
}
