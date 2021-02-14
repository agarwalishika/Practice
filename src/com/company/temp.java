package com.company;

public class temp {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int num = 0;
        int n = 1000544320;
        while (j < n) {
            i = i + 1;
            j = j + i;
            num++;
        }

        double x = Math.sqrt(n);
        double y = Math.log10(n) / Math.log10(2);
        System.out.println(num);
        System.out.println(x);
        System.out.println(y);
    }
}
