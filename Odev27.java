package com.company;

import java.util.Scanner;

public class Odev27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, max, min, number;

        System.out.println("Kaç adet sayı gireceksiniz: ");
        count = input.nextInt();
        System.out.println("1. sayıyı giriniz: ");
        number = input.nextInt();
        max = number;
        min = number;

        for (int i = 0; i < count - 1; i++) {
            System.out.println(i + 2 + ". sayıyı giriniz: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("\n\nEn büyük sayı: " + max + "\nEn küçük sayı: " + min);
    }
}
