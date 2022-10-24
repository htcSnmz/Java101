package com.company.Odev50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, c;
        System.out.println("Mayın tarlası oyununa hoşgeldiniz...");
        while(true) {
            System.out.print("Board boyutu için satır giriniz: ");
            r = scanner.nextInt();
            System.out.print("Board boyutu için sütun giriniz: ");
            c = scanner.nextInt();
            if (r <= 0 || c <= 0) {
                System.out.println("Satır ve sütun değeri sıfırdan büyük olmalıdır!");
            } else {
                break;
            }
        }
        MineSweeper mineSweeper = new MineSweeper(r, c);
        mineSweeper.run();
    }
}
