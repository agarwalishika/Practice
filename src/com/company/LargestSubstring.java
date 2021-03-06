package com.company;

public class LargestSubstring {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -2;
        for (int i = 0; i < s.length(); i+=1) {
            char begc = s.charAt(i);
            int endc = s.lastIndexOf(begc);

            if (endc != begc) {
                int currLen = endc - 1 - i;
                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters("cbzxyaw");
    }
}
