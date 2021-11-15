package com.company;
import java.util.Scanner;
public class Task4 {

    public static double[][] Minus(double[][] matrix, int[][] a, int[][] b, int n ) {

        System.out.println("Разница матриц: ");
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                c[i][j] = a[i][j] - b[i][j];
                matrix[i][j] = c[i][j];
                System.out.print(c[i][j] + "\t");

            }

            System.out.println();

        }

        return matrix;
    }
    public static double[][] Summ(double[][] matrix, int[][] a, int[][] b, int n) {

        System.out.println("Сумма матриц: ");
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                c[i][j] = a[i][j] + b[i][j];
                matrix[i][j] = c[i][j];
                System.out.print(c[i][j] + "\t");

            }

            System.out.println();

        }

return matrix;
    }
    public static void Midle(double[][]matrix,int n){
        double sum = 0;
        double element = 0;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                element = matrix[i][j];
                sum += element;

            }

        }
        sum = sum/(n*n);
        System.out.println("Среднее значение матриц "+sum);
    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = in.nextInt();
        in.close();
        int num = 1;
        int [][] a = new  int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a [i][j] = num;
                num++;
            }
        }
        num = 1;
        int [][] b = new  int [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b [i][j] = num ;
                num++;
            }
        }
        System.out.println("Матрица 1: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Матрица 2: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }
        double[][] matrix = new double[n][n];
        Summ(matrix, a,b,n);
        Midle(matrix,n);




//        System.out.println("Сумма матриц: ");
//        int[][]c = new int[n][n];
//        for (int i = 0; i < n; i++) {
//
//            for (int j = 0; j < n; j++) {
//
//                c[i][j] = a[i][j] + b[i][j];
//                matrix [i][j] =  c[i][j];
//                System.out.print(c[i][j] + " ");
//
//            }
//
//            System.out.println();
//
//        }




//        double sum = 0;
//        double element = 0;
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//               element = matrix[i][j];
//               sum += element;
//
//            }
//            System.out.println();
//        }
//        System.out.println("Average: " + sum/(n*n));
    }
    }

