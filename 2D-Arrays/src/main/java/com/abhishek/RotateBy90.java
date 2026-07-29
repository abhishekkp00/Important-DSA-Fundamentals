package com.abhishek;

import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n != m){
            System.out.println("Enter the sqaure matrix");
            return;
        }
        int[][] matrix = new int[n][m];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        int left = 0;
        int right = matrix[0].length - 1;

        while (left < right) {

            for (int i = 0; i < matrix.length; i++) {

                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }

            left++;
            right--;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
