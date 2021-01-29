package com.company;

public class HowManyTimesCalled {
    public static int val = 0;

    public static void main(String[] args) {
        int n = 1000;
        for (int i = 1; i <= n; i++) {
            int m = 0;
            for (int j = 1; j <= i; j++){
                m = m + j;
            }

            int k = 2;
            while(k < m) {
                F();
                k += 2;
            }
        }

        System.out.println(val);
    }

    public static void F() {
        val++;
    }
}
