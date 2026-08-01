package com.abhishek;

import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {

            // Find minimum element in current row
            int minCol = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < matrix[i][minCol]) {
                    minCol = j;
                }
            }

            // Check if it is maximum in its column
            boolean saddlePoint = true;

            for (int k = 0; k < n; k++) {
                if (matrix[k][minCol] > matrix[i][minCol]) {
                    saddlePoint = false;
                    break;
                }
            }

            if (saddlePoint) {
                System.out.println(matrix[i][minCol]);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}