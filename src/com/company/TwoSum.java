package com.company;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, i);
        }

        int[] sol = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int diff = k - arr[i];
            if (map.get(diff) != null) {
                sol[0] = arr[i];
                sol[1] = diff;
                return sol;
            }
        }


        return null;
    }
}
