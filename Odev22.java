/*
Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
 */
package com.company;

import java.util.Scanner;

public class Odev22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, x;

        System.out.print("Bir tamsayı giriniz: ");
        number = input.nextInt();

        while (number > 0) {
            x = number % 10;
            sum += x;
            number = (number - x) / 10;
        }

        System.out.print("Girilen sayının basamak toplamı: " + sum);
    }
}
