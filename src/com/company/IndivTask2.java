package com.company;

import java.util.Scanner;

public class IndivTask2 {
    public static void checkIfEqualOption1(long[] arr) {

        int sumTotal = 0;

        int sumRight = 0;
        int sumLeft = 0;

        for (int i = (arr.length) / 2; i > 0; i--) {
            sumLeft += arr[i-1];
        }
        for (int i = ((arr.length) / 2)-1; i < arr.length - 1; i++) {
            sumRight += arr[i+1];}

            sumTotal = sumLeft - sumRight;
            System.out.println("Итог: "+sumTotal);

        }
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int n = in.nextInt();
            in.close();
            long[] numbers = new long[n];
            System.out.println("Ваш массив: ");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i]= Math.round(Math.random() * 100);
                System.out.print(numbers[i] + "\t");

            }
            System.out.println("\n");
            checkIfEqualOption1(numbers);
        }
    }

