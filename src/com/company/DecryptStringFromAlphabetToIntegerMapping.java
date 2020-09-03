package com.company;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static String freqAlphabets(String s) {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                str += "" +
                        (char)('a' - 1 + Integer.parseInt("" + s.charAt(i) + s.charAt(i + 1)));
                i += 2;
            } else {
                str += (char)('a' - 1 + Integer.parseInt("" + s.charAt(i)));
            }
        }

        return str;
    }

    public static void main(String[] args) {
        freqAlphabets("1326#");
    }
}
