// Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
package com.company;

public class Odev40 {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 5, 6, 9, 16, 27, 9, 86, 15};
        double sum = 0;
        double harmonicMean;

        for(int i = 0; i< numbers.length;i++){
            sum += (1 / (double)numbers[i]);
        }
        harmonicMean = numbers.length / sum;
        System.out.println("Dizinin harmonik ortalaması = " + harmonicMean);
    }
}
