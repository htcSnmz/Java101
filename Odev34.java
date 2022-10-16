package com.company;

import java.util.Scanner;

public class Odev34 {

    public static void main(String[] args) {
        int base, pow;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        pow = input.nextInt();
        System.out.println("Sonuç = " + getPow(base, pow));
    }

    public static int getPow(int base, int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return base * getPow(base, (pow - 1));
        }
    }
}
