package com.company;

public class FinalPricesWithSpecialDiscount {
    public static int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            int max = findMaxAfter(prices, prices[i], i + 1);
            if (max <= prices[i]) {
                prices[i] -= max;
            }
        }

        return prices;
    }

    public static int findMaxAfter(int[] nums, int curr, int i) {
        for(; i < nums.length; i++) {
            if (nums[i] <= curr) {
                return nums[i];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] x = {8, 4, 6, 2, 3};
        finalPrices(x);
    }
}
