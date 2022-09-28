package com.company;

public class Odev29 {
    public static void main(String[] args) {
        boolean isPrime = true;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
