package com.company;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println("Обычная матрица");
        int[][] matrix = new int[7][7];
        int count = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = count;
                count++;
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Повернутая на 90 градусов");
        System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=tmp;

            }

        }


        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 / 2; j++) {

                matrix[i][j] += matrix[i][6 - j];
                matrix[i][6 - j] = matrix[i][j] - matrix[i][6 - j];
                matrix[i][j] -= matrix[i][6 - j];

            }

        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {

                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }
    }
}


