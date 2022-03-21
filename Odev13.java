package com.company;

import java.util.Scanner;

public class Odev13 {

    public static void main(String[] args) {
        byte month, day;
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum ayınızı girin: ");
        month = input.nextByte();

        System.out.print("Doğum gününüzü girin: ");
	    day = input.nextByte();

        if (month <= 0 || month > 12){
            System.out.println("Doğum ayı 1 ile 12 arasında olmalıdır.");
        } else if (month == 1){
            if(day >= 1 && day <= 21){
                System.out.println("Oğlak Burcu");
            } else if (day >= 22 && day <= 31){
                System.out.println("Kova Burcu");
            }else{
                isError = true;
            }
        } else if (month == 2){
            if(day >= 1 && day <= 19){
                System.out.println("Kova Burcu");
            } else if (day >= 20 && day <= 29){
                System.out.println("Balık Burcu");
            }else{
                isError = true;
            }
        }else if (month == 3){
            if(day >= 1 && day <= 20){
                System.out.println("Balık Burcu");
            } else if (day >= 21 && day <= 31){
                System.out.println("Koç Burcu");
            }else{
                isError = true;
            }
        }else if (month == 4){
            if(day >= 1 && day <= 20){
                System.out.println("Koç Burcu");
            } else if (day >= 21 && day <= 31){
                System.out.println("Boğa Burcu");
            }else{
                isError = true;
            }
        }else if(month == 5){
            if(day >= 1 && day <= 21){
                System.out.println("Boğa Burcu");
            } else if (day >= 22 && day <= 31){
                System.out.println("İkizler Burcu");
            }else{
                isError = true;
            }
        }else if(month == 6){
            if(day >= 1 && day <= 22){
                System.out.println("İkizler Burcu");
            } else if (day >= 23 && day <= 31){
                System.out.println("Yengeç Burcu");
            }else{
                isError = true;
            }
        }else if(month == 7){
            if(day >= 1 && day <= 22){
                System.out.println("Yengeç Burcu");
            } else if (day >= 23 && day <= 31){
                System.out.println("Aslan Burcu");
            }else{
                isError = true;
            }
        }else if(month == 8){
            if(day >= 1 && day <= 22){
                System.out.println("Aslan Burcu");
            } else if (day >= 23 && day <= 31){
                System.out.println("Başak Burcu");
            }else{
                isError = true;
            }
        }else if(month == 9){
            if(day >= 1 && day <= 22){
                System.out.println("Başak Burcu");
            } else if (day >= 23 && day <= 31){
                System.out.println("Terazi Burcu");
            }else{
                isError = true;
            }
        }else if(month == 10){
            if(day >= 1 && day <= 22){
                System.out.println("Terazi Burcu");
            } else if (day >= 23 && day <= 31){
                System.out.println("Akrep Burcu");
            }else{
                isError = true;
            }
        }else if(month == 11){
            if(day >= 1 && day <= 21){
                System.out.println("Akrep Burcu");
            } else if (day >= 22 && day <= 31){
                System.out.println("Yay Burcu");
            }else{
                isError = true;
            }
        }else {
            if(day >= 1 && day <= 21){
                System.out.println("Yay Burcu");
            } else if (day >= 22 && day <= 31){
                System.out.println("Oğlak Burcu");
            }else{
                isError = true;
            }
        }
        if(isError)
            System.out.println("Yanlış gün değeri girildi.");
    }
}
