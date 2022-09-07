package com.company;

import java.util.LinkedHashSet;

public class Loops {

    private static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    private static void printAsterixTriangle(int size) {
        for(int i = 0; i < size; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printTriangleUpsideDown(int size){
        for (int i = size; i > 0; i--){
            for (int j = 0; j < size - i; j++){
                System.out.print(' ');
            }
            for (int k = 0; k < 2 * i - 1; k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static int countDigits(int num){
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }

    private static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int c;
        int sum = 0;
        while (a <= n) {
            System.out.printf("%d ", a);
            sum += a;
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("sum = " + sum);
    }

    private static void printDays() {
        LinkedHashSet<String> days = new LinkedHashSet<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println(days);
    }

    public static void main(String[] args) {
        /*System.out.println(factorial(10));
        printAsterixTriangle(4);
        printTriangleUpsideDown(4);
        System.out.println(countDigits(123));
        fibonacci(10);*/
        printDays();
    }
}
