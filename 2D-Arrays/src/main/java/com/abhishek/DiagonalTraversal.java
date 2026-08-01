package com.abhishek;

import java.util.Scanner;

public class DiagonalTraversal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int gap = 0; gap < m; gap++) {

            for (int i = 0, j = gap; i < n && j < m; i++, j++) {
                System.out.println(matrix[i][j]);
            }

        }
    }
}