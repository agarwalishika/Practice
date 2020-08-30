package com.company;

/*
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractTheProductAndSumsOfDigits {
    public int subtractProductAndSum(int n) {
        int numDig = getNumDigits(n);
        int prod = 1;
        int sum = 0;

        for (int i = 0; i < numDig; i++) {
            int dig = getDigit(i, n);
            prod *= dig;
            sum += dig;
        }

        return prod - sum;
    }

    public int getDigit(int ith, int n) {
        return Integer.parseInt("" + ("" + n).charAt(ith));
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
