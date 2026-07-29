package com.abhishek;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int k = sc.nextInt();
        int l = sc.nextInt();

        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[k][l];

        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[0].length; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        if(m != k){
            System.out.println("Not Valid input");
            return;
        }

        int[][] product = new int[n][l];

        for(int i = 0; i < product.length; i++){
            for(int j = 0; j < product[0].length; j++) {
                for (int p = 0; p < m; p++){
                    product[i][j] += matrix1[i][p] * matrix2[p][j];
                }
            }
        }
        for(int i = 0; i < product.length; i++){
            for(int j = 0; j < product[0].length; j++) {
                System.out.print(product[i][j] + " ") ;
            }
            System.out.println();
        }

    }


}
