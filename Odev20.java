/*
Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

package com.company;

import java.util.Scanner;

public class Odev20 {
    public static void main(String[] args) {
        int n, r, comb;
        Scanner input = new Scanner(System.in);

        System.out.println("C(n,r) hesaplaması için n ve r sayılarını giriniz.");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        comb = (fact(n)) / (fact(r) * fact(n - r));

        System.out.println("C(" + n + "," + r + "): " + comb);

    }
    public static int fact(int number){
        int fact = 1;
        for(int i = 2; i <= number; i++){
            fact *= i;
        }
        return fact;
    }
}
