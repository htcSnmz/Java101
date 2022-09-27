package com.company;

import java.util.Scanner;

public class Odev28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayisini Giriniz : ");
        int basamak = input.nextInt();

        for (int i = basamak; i >= 1; i--) {
            for (int j = basamak; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
