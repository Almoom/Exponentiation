package ru.geekbrains;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static int sum2 = 1;
    public static int sum3 = 1;
    public static int temp = 1;
    public static void main(String[] args) {
        int repeatQuestion = 1;
        here:
        while (repeatQuestion != 0) {
            System.out.println("Последовательно через Enter введите число и его степень:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(WithoutRecursive(a,b));
            System.out.println(Recursive(a,b));
            sum2 = 1;
            System.out.println(EvenDegreeRecursive(a,b)*temp);
            sum3 = 1;
            temp = 1;
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
    public static int Recursive(int a, int b) {
        if (b > 0){
            sum2 = sum2*a;
            Recursive(a,b-1);
        }else return sum2;
        return sum2;
    }
    public static int EvenDegreeRecursive(int a, int b) {
        if (b > 1){
            sum3 = a;
            if (b%2==0){
                sum3 = sum3*sum3;
                EvenDegreeRecursive(sum3,b/2);
            }else{
                temp = temp*sum3;
                EvenDegreeRecursive(sum3,b-1);
            }
        }else return sum3;
        return sum3;
    }
}