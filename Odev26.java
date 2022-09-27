package com.company;

import java.util.Scanner;

public class Odev26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        boolean isPositive = false;
        do {
            System.out.print("Birinci sayiyi giriniz: ");
            n1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            n2 = input.nextInt();
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Sayılar 0'dan büyük olmalıdır. ");
            } else {
                isPositive = true;
            }
        } while (!isPositive);
        if (n2 < n1) {
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }
        int i = n1;
        while (i >= 1) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("Ebob: " + i);
                break;
            } else {
                i--;
            }
        }
        int j = n2;
        while (j <= (n1 * n2)) {
            if ((j % n1 == 0) && (j % n2 == 0)) {
                System.out.println("Ekok: " + j);
                break;
            } else {
                j++;
            }
        }
    }
}

