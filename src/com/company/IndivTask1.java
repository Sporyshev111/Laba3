package com.company;

import java.util.Scanner;

public class IndivTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = in.nextInt();
        in.close();
        double[][] matrix = new double[n][n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.round(Math.random() * 100);
            }
        }

        System.out.println("Отображаем матрицу симметрично по диагонали: ");
        int j = 1;
       int  l = 1;
        for(int i = 0; i < n; i++)
        {
            for(; j < n; j++)
                matrix[j][i] = matrix[i][j];
            j = ++l;
        }
        for (int i = 0; i < n; i++) {
            for ( j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+"\t");

            }
            System.out.println();

        }


    }
}
