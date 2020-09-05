package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNums = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (findMinInRow(i, matrix) == findMaxInCol(j, matrix)) {
                    luckyNums.add(matrix[i][j]);
                }
            }
        }

        return luckyNums;

    }

    public int findMinInRow(int r, int[][] matrix) {
        int[] copy = Arrays.copyOf(matrix[r], matrix[r].length);
        Arrays.sort(copy);
        return copy[0];
    }

    public int findMaxInCol(int c, int[][] matrix) {
        int[] copy = new int[matrix.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = matrix[i][c];
        }

        Arrays.sort(copy);
        return copy[copy.length - 1];
    }
}
