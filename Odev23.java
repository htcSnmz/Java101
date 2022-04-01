/*
Java ile girilen sayının harmonik serisini bulan program yazacağız.
 */

package com.company;

import java.util.Scanner;

public class Odev23 {
    public static void main(String[] args) {

        int n;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();

        for(double i = 1; i <= n; i++){
            result += (1 / i);
        }
        System.out.println("Girilen sayının harmonik serisi: " + result);
    }
}
