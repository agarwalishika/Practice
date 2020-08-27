package com.company;

/*
https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public static int numJewelsInStones(String J, String S) {
        int numSim = 0;

        for (int i = 0; i < J.length(); i++) {
            char j = J.charAt(i);
            int curr = S.indexOf(j);
            while (curr >= 0) {
                numSim++;
                curr = S.indexOf(j, curr + 1);
            }
        }

        return numSim;
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        System.out.println(numJewelsInStones(J, S));
    }
}
