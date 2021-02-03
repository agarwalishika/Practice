package com.company;

public class decodeXOR {
    public int[] decode(int[] code, int first) {
        int[] result = new int[code.length + 1];
        result[0] = first;

        for (int i = 0; i < code.length; i+=1) {
            result[i+1] = (code[i] ^ result[i]);
        }

        return result;
    }
}
