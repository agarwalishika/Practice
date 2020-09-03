package com.company;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        int i = left;
        for (; i < 10 && i < right; i++) {
            nums.add(i);
        }

        /*
        Three:
        1. range in 1-9
            dont go the next
        2. left is 1-9
            add as many and go the next. left should be where right was left off
        3. left is out of 1-9
            do only the next
        */

        if (right <= 10) {  //1
            return nums;
        }

        for(; i <= right; i++) {
            String s = "" + i;

            if (isSelfDiv(i)) {
                nums.add(i);
            }
        }

        return nums;
    }

    public boolean isSelfDiv(int num) {
        int temp = num;
        while (temp != 0) {
            if (temp % 10 != 0 && temp % (num % 10) != 0) {
                return false;
            }

            temp /= 10;
        }

        return true;
    }
}
