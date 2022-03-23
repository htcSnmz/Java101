/*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
Çin Zodyağı nedir?
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.
Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */

package com.company;

import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        int birthYear, mod;
        String horoscope = null;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Girin: ");
        birthYear = input.nextInt();
        mod = birthYear % 12;

        if (birthYear > 0) {
            switch (mod) {
                case 0:
                    horoscope = "Maymun";
                    break;
                case 1:
                    horoscope = "Horoz";
                    break;
                case 2:
                    horoscope = "Köpek";
                    break;
                case 3:
                    horoscope = "Domuz";
                    break;
                case 4:
                    horoscope = "Fare";
                    break;
                case 5:
                    horoscope = "Öküz";
                    break;
                case 6:
                    horoscope = "Kaplan";
                    break;
                case 7:
                    horoscope = "Tavşan";
                    break;
                case 8:
                    horoscope = "Ejderha";
                    break;
                case 9:
                    horoscope = "Yılan";
                    break;
                case 10:
                    horoscope = "At";
                    break;
                case 11:
                    horoscope = "Koyun";
                    break;
            }
            System.out.println("Çin Zodyağı Burcunuz: " + horoscope);
        } else {
            System.out.println("Hatalı Giriş Yaptınız.");
        }

    }
}
