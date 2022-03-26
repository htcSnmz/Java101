/*
Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

package com.company;

import java.util.Scanner;

public class Odev18 {
    public static void main(String[] args) {
        int number = 0, sum = 0;
        Scanner input = new Scanner(System.in);

        while (number % 2 == 0) {
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        }
        System.out.println("Toplam: " + sum);
    }
}
