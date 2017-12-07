package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Последовательно через Enter введите число и его степень:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(WithoutRecursive(a,b));
            System.out.println("");
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            repeatQuestion = scanner.nextInt();
            if (repeatQuestion == 1) continue here;
            else break;
        }
    }
    public static int WithoutRecursive(int a, int b) {
        int sum = 1;
        for (int i = b; i > 0 ; i--) sum = sum*a;
        return sum;
    }
}