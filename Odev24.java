/*
Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
 */

package com.company;

import java.util.Scanner;

public class Odev24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayi giriniz: ");
        int num = input.nextInt();
        num /= 2;
        num++;

        for (int i = 0; i < num; i++) {
            for (int j = num; j > (i + 1); j--)
                System.out.print(" ");

            for (int k = 0; k < (i * 2) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int temporary = 1;
        for (int i = num - 1; i > 0; i--) {
            for (int j = 0; j < temporary; j++)
                System.out.print(" ");
            temporary++;

            for (int k = 0; k < (i * 2) - 1; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
