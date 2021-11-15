package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class Task6 {
    public static int Minimum (int [] arr, int n )
    {

        int min = arr[0];
        for (int i=0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }


        return min;
    }
    public static int Recursion_minimum (int[] arr, int frm, int to) {
        if(to-frm <= 1) {//(1)
            return arr[frm];
        } else {         //(2)
            int mid = (frm+to)/2;
            int m1 = Recursion_minimum(arr,frm,mid);
            int m2 = Recursion_minimum(arr,mid,to);
            int minimum = Math.min(m1,m2);
//            System.out.println(minimum);
            return minimum;
        }
    }

    static int RecursionSum(int arr[], int n)
    {
        if (n <= 0)
            return 0;
        return (RecursionSum(arr, n - 1) + arr[n - 1]);
    }
    // method for sum of elements in an array
    public static int Sum(int []arr)
    {
        int sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for (i = 0; i < arr.length; i++)
            sum +=  arr[i];

        return sum;
    }
    public static void main(String[] args)
    { Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
       int arr[] = new int [n];
       for(int i = 0; i < arr.length; i++)
       {
           arr[i] =(int)Math.round(Math.random()*100);
           System.out.print(arr[i]+"\t");
       }
        System.out.println();

       System.out.println("Sum of given array is " + Sum(arr));
        System.out.println("Recursion sum of given array is " + RecursionSum(arr, n));
        System.out.println("Recursion minimum of given array is "+Recursion_minimum(arr,0,n));
        System.out.println("Minimum of given array is "+Minimum(arr,n));



    }
}
