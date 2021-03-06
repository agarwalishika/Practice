package com.company;

/*
https://leetcode.com/problems/xor-operation-in-an-array/
 */
public class XorOperationInAnArray {
    public int xorOperation(int n, int start) {
        int temp = start;
        for (int i = 1; i < n; i++) {
            temp = temp ^ (start + 2 * i);
        }

        return temp;
    }
}
