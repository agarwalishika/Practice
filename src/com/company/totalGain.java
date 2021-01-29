package com.company;

public class totalGain {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int total = 0;

        for (int i = 0; i < gain.length; i++) {
            total += gain[i];
            if (total > max) {
                max = total;
            }
        }

        return max;
    }
}
