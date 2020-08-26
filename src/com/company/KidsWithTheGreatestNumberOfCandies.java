package com.company;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 */

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        System.out.println(max);
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> isGreatestList = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            isGreatestList.add((max <= candies[i] + extraCandies));
        }

        return isGreatestList;
    }
}
