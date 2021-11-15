package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static double[][] Minor(double[][] matrix, int n) {
        double[][] res = new double[Array.getLength(matrix) - 1][Array.getLength(matrix) - 1];
        for (int i = 1; i < Array.getLength(matrix); i++) {
            for (int j = 0, col = 0; j < Array.getLength(matrix); j++) {
                if (j == n)
                    continue;
                res[i - 1][col] = matrix[i][j];
                col++;
            }
        }
        return res;
    }

    public static double OpredelitelMatrix(double[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        }

        if (matrix.length == 4) {
            return matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
        } else {
            double result = 0;

            for (int i = 0; i < Array.getLength(matrix); i++) {
                double[][] Min = Minor(matrix, i);
                result += Math.pow(-1, i) * matrix[0][i] * OpredelitelMatrix(Min);
            }
            return result;
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int n = in.nextInt();
        in.close();
        double[][] matrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.round(Math.random() * 100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();

        }
        System.out.println("Определитель матрицы "+OpredelitelMatrix(matrix));
    }
}