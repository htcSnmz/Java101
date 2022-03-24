// Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
package com.company;

import java.util.Scanner;

public class Odev16 {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + " Artik Yildir");
            } else if ((year % 100 == 0) && (year % 400 == 0)) {
                System.out.println(year + " Artik Yildir");
            } else {
                System.out.println(year + " Artik Yil Degildir.");
            }
        } else {
            System.out.println(year + " Artik Yil Degildir.");
        }
    }
}

