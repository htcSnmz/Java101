/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM),
yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

   */

package com.company;

import java.util.Scanner;

public class Odev14 {

    public static void main(String[] args) {
        float payPerDistance = 0.10f, discount12 = 0.5f, discount12_24 = 0.1f, discount65 = 0.3f, roundTripDiscount = 0.2f;
	    float distance, amount = 0.0f;
        byte typeOfTrip, age;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz: ");
        distance = input.nextFloat();
        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextByte();
        System.out.print("Yolculuk türünü seçiniz:    1 => Tek Yön , 2 => Gidiş Dönüş ");
        typeOfTrip = input.nextByte();

        if((distance <= 0) || (age < 0) || (typeOfTrip <=0 || typeOfTrip > 2)){
            System.out.println("Hatalı Veri Girdiniz!");
        }else{
            amount = payPerDistance * distance;
        }

        if(age < 12){
            amount = amount - (amount * discount12);
        } else if (age < 24){
            amount = amount - (amount * discount12_24);
        }else if(age > 65){
            amount = amount - (amount * discount65);
        }

        if(typeOfTrip == 2){
            amount = amount - (amount * roundTripDiscount);
        }

        System.out.println("Toplam Tutar: " + amount + "TL");

    }
}
