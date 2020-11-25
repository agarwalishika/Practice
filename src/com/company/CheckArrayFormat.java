package com.company;

public class CheckArrayFormat {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        String arrStr = arrToString(arr);
        for (int i = 0; i < pieces.length; i++) {
            String pTemp = arrToString(pieces[i]);
            int index = arrStr.indexOf(pTemp);
            if (index < 0) {
                return false;
            }
        }

        return true;
    }

    private static String arrToString(int[] a) {
        String temp = "";
        for(int i = 0; i < a.length; i++) {
            temp += "" + a[i];
            temp += ",";
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a = {12};
        int [][] b = {{1}};
        System.out.println(canFormArray(a, b));
    }
}
