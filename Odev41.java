//Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Odev41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 24, -32, 54};
        int min = arr[0];
        int max = arr[0];

        System.out.println(Arrays.toString(arr));
        System.out.print("Sayı Giriniz : ");
        int input = scan.nextInt();

        Arrays.sort(arr);
        for (int i : arr) {
            if (i < input) {
                min = i;
            }
            if (i > input) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayı : " + input);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
