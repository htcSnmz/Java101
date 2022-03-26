/*
Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
ortalamasını hesaplayan programı yazınız.
 */
package com.company;

import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        int sum = 0, counter = 0, num;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i % 12 == 0) {
                sum += i;
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Ortalama: " + sum / counter);
        } else {
            System.out.println("3'e ve 4' tam bölünebilen sayı bulunamadı.");
        }
    }
}
