package com.company;

import java.util.Scanner;

public class Task5 {
    public static int [][] Multiplication(int [][]a,int [][]b, int n){
        System.out.println("Произведение матриц: ");
        int[][] c = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                c[i][j] = a[i][j] * b[i][j];
                System.out.print(c[i][j] + "\t");

            }

            System.out.println();

        }

       return c;
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
        Multiplication(a,b,n);


        }
    }

