package com.company;

import java.util.Scanner;

public class Odev36 {
    static boolean state = true;
    static int counter = 0;

    public static int pattern(int n) {

        if (state == true && n > 0) {
            System.out.print(n + " ");
            n -= 5;
            counter++;
            return pattern(n);
        } else {
            state = false;
            counter--;
            System.out.print(n + " ");
            n += 5;

            if (counter == 0) {
                System.out.print(n);
                return 1;
            } else {
                return pattern(n);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();
        int number2 = number;
        pattern(number);
    }
}
