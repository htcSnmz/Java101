package com.company;

import java.util.Scanner;

public class Odev31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        isPalindrom(number);
    }

    static void isPalindrom(int number) {
        int temp = number, rNumber = 0, lNumber = 0;

        while (temp != 0) {
            lNumber = temp % 10;
            rNumber = (rNumber * 10) + lNumber;
            temp /= 10;
        }
        if (number == rNumber){
            System.out.println(number + " palindrom sayıdır.");
        } else {
            System.out.println(number + " palindrom sayı değildir.");
        }

    }
}
