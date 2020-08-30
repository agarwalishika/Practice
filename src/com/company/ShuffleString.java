package com.company;

/*
https://leetcode.com/problems/shuffle-string/submissions/
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] str = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            str[indices[i]] = s.charAt(i);
        }

        return new String(str);
    }
}
