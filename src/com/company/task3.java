package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число элемнтов: ");
        int x = scanner.nextInt();
        System.out.println("Введите сдвиг: ");
        int k = scanner.nextInt();

        int[] arr = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Введите значение элемента №"+i);
            arr[i] = scanner.nextInt();
        }

        if (k > x) {
            k = k % x;
        }
        for (int j = 0; j < k; j++) {
            int tmp = arr[x - 1];
            for (int i = x - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }   arr[0] = tmp;
        }

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
