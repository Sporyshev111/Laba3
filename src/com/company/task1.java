package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


                Random rand = new Random();
                System.out.println("Введите число элементов массива");
                int num = scanner.nextInt();


                if (num > 0) {
                    int[] array;
                    array = new int[num];
                    for (int i = 0; i < array.length; i++) {
                        if (i % 10 == 0 && i > 0) {
                            System.out.println();
                        }
                        array[i] = rand.nextInt(45) - 30;
                        System.out.print(array[i]+ " ");



                    }
                }
                else {
                    System.out.println("Элементов долно быть > 0");
                }





    }
}
