package com.abhishek;

import java.util.Scanner;

public class SearchIn2D {
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
        System.out.println("Enter the ele to search: ");
        int k = sc.nextInt();

        int i = 0;
        int j = matrix[0].length - 1;

        while(i < matrix.length && j >= 0){
            if(matrix[i][j] == k){
                System.out.println("Found: " + i + " " + j);
                return;
            }else if(matrix[i][j] < k){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Not found");

    }
}
