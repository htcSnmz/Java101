/*
Ödev
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */

package com.company;

import java.util.Scanner;

public class Odev19 {
    public static void main(String[] args) {
        int num, i = 1, j = 1 ;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        while((i <= num) && (j <= num)){
            System.out.println("4'ün katı: " + i);
            System.out.println("5'in katı: " + j);
            i *= 4;
            j *= 5 ;
        }
    }
}
