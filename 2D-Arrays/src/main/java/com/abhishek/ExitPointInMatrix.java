package com.abhishek;

//https://www.geeksforgeeks.org/problems/exit-point-in-a-matrix0905/1

import java.util.Scanner;

public class ExitPointInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = dir + matrix[i][j] % 4;

            if(dir == 0) j++;
            else if(dir == 1) i++;
            else if(dir == 2) j--;
            else if(dir == 3) i--;

            if(i == matrix.length){
                i--;
                break;
            }
            else if(i < 0){
                i++;
                break;
            }
            else if(j == matrix[0].length){
                j--;
                break;
            }else if(j < 0){
                j++;
                break;
            }
        }
        System.out.print(i + " " +j);

    }
}
