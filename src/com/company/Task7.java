package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Task7 {
public  static int Fibonachi(int n)
{
    if (n == 1 || n == 2)
        return 1;
    else
        return Fibonachi(n - 1) + Fibonachi(n - 2);
}
    public static void main(String[] args)
    {
        System.out.println("Введиоте какой индекс вы будете искать: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println("Элемент под номером "+n+" = "+Fibonachi(n));

    }

}
