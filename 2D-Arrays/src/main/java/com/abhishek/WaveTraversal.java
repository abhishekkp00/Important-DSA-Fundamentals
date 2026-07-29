package com.abhishek;

import java.util.Scanner;

public class WaveTraversal {
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
        for(int i = 0; i < matrix[0].length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < matrix.length; j++) {
                    System.out.println(matrix[j][i]);
                }
            }else{
                for (int j = matrix.length - 1; j >= 0; j--){
                    System.out.println(matrix[j][i]);
                }
            }
        }
    }
}
