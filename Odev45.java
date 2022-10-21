package com.company;

import java.util.Scanner;

// Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
// Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
public class Odev45 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Dizinin boyutunu giriniz: ");
        size = input.nextInt();
        int[] numbers = new int[size];


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i + 1 + ". sayıyı tamsayı olarak giriniz: ");
            numbers[i] = input.nextInt();
        }

        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
