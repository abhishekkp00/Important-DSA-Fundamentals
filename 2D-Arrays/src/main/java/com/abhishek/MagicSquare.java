package com.abhishek;
import java.util.*;

public class MagicSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int targetSum = 0;

        // First row sum
        for (int j = 0; j < n; j++) {
            targetSum += matrix[0][j];
        }

        // Check every row
        for (int i = 0; i < n; i++) {

            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }

            if (rowSum != targetSum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        // Check every column
        for (int j = 0; j < n; j++) {

            int colSum = 0;

            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }

            if (colSum != targetSum) {
                System.out.println("Not a Magic Square");
                return;
            }
        }

        // Main diagonal
        int diag1 = 0;

        for (int i = 0; i < n; i++) {
            diag1 += matrix[i][i];
        }

        if (diag1 != targetSum) {
            System.out.println("Not a Magic Square");
            return;
        }

        // Secondary diagonal
        int diag2 = 0;

        for (int i = 0; i < n; i++) {
            diag2 += matrix[i][n - 1 - i];
        }

        if (diag2 != targetSum) {
            System.out.println("Not a Magic Square");
            return;
        }

        System.out.println("Magic Square");
    }
}