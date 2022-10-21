package com.company;

import java.util.Arrays;

public class Odev46 {

    static boolean isFind(int[] arr, int val, int n) {
        for (int i = 0; i < n; i++) {
            if (val == arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int getFrequency(int[] arr, int value) {
        int frequency = 0;
        for (int i : arr) {
            if (i == value)
                frequency++;
        }
        return frequency;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (isFind(numbers, numbers[i], i)) {
                System.out.println(numbers[i] + " sayısı " + getFrequency(numbers, numbers[i]) + " kez tekrar edildi.");
            }
        }
    }
}