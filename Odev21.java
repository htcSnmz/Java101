/*
Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
 */
package com.company;

import java.util.Scanner;

public class Odev21 {
    public static void main(String[] args) {
        int number, exponent;
        float result = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        number = input.nextInt();
        System.out.print("Üssü giriniz: ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= number;
        }
        System.out.printf("%d^%d = %.0f", number, exponent, result);
    }
}
