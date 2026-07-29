package com.abhishek;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                System.out.println(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                System.out.println(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.println(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.println(matrix[i][left]);
                }
                left++;
            }
        }
    }
}
