package com.company;

import java.util.Scanner;

public class Odev35 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı asaldır!");
        } else {
            System.out.println(number + " sayısı  asal değildir!");
        }
    }

    static boolean isPrime(int number, int i) {

        if (number % i == 0) {
            return false;
        } else if (i * i > number) {
            return true;
        }
        return isPrime(number, i + 1);
    }
}
