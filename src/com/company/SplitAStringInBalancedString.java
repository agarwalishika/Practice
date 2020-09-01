package com.company;

public class SplitAStringInBalancedString {
    public int balancedStringSplit(String s) {
        int rCount = 0;
        int lCount = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }

            if (rCount == lCount && rCount != 0) {
                count++;
                rCount = 0;
                lCount = 0;
            }
        }

        return count;
    }
}
