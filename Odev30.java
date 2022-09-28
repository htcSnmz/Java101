package com.company;

import java.util.Scanner;

public class Odev30 {
    public static void main(String[] args) {

        int number1 = 0, number2 = 1, element, result = number1 + number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi için elaman sayısı giriniz: ");
        element = input.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + result);
        for (int i = 0; i < element - 2; i++) {
            number1 = number2;
            number2 = result;
            result = number1 + number2;
            System.out.println(number1 + " + " + number2 + "= " + result);
        }
    }
}
