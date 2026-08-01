package com.abhishek;

import java.util.Scanner;

public class ShellRotation {

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void rotate(int[] arr, int r) {

        int n = arr.length;

        r %= n;

        if (r < 0)
            r += n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
    }

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

        int shell = sc.nextInt();
        int rotation = sc.nextInt();

        int left = shell - 1;
        int right = m - shell;
        int top = shell - 1;
        int bottom = n - shell;

        int size = 2 * (bottom - top + right - left);

        int[] arr = new int[size];

        int idx = 0;

        // Left Wall
        for (int i = top; i <= bottom; i++)
            arr[idx++] = matrix[i][left];

        // Bottom Wall
        for (int j = left + 1; j <= right; j++)
            arr[idx++] = matrix[bottom][j];

        // Right Wall
        for (int i = bottom - 1; i >= top; i--)
            arr[idx++] = matrix[i][right];

        // Top Wall
        for (int j = right - 1; j >= left + 1; j--)
            arr[idx++] = matrix[top][j];

        rotate(arr, rotation);

        idx = 0;

        // Left Wall
        for (int i = top; i <= bottom; i++)
            matrix[i][left] = arr[idx++];

        // Bottom Wall
        for (int j = left + 1; j <= right; j++)
            matrix[bottom][j] = arr[idx++];

        // Right Wall
        for (int i = bottom - 1; i >= top; i--)
            matrix[i][right] = arr[idx++];

        // Top Wall
        for (int j = right - 1; j >= left + 1; j--)
            matrix[top][j] = arr[idx++];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}