package com.company;

public class DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        if (k == 0) { return arr; }

        for (int i = 0; i < code.length; i+=1) {
            int curr = 0;

            if (k > 0) {
                for (int j = 1; j <= k; j+=1) {
                    int temp = (i + j) % code.length;
                    curr += code[temp];
                }
            } else {
                for (int j = 1; j <= Math.abs(k); j++) {
                    int temp = i - j;
                    if (temp < 0) {
                        temp += code.length;
                    }
                    curr += code[temp];
                }
            }
            arr[i] = curr;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {2,4,9,3};
        int k = -2;
        int[] d = decrypt(a, k);
    }
}
