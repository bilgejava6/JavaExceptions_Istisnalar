package com.muhammet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Uygulamalarımız her daim sorun çıkartma kapasitesine sahiptir. bu nedenle
         * özellikle kullanıcı ile etkileşime girdiğimiz tüm kodlamaları dikkatle inceleyip
         * hata yakalama işlemlerine öncelik vermeliyiz.
         * Syntax:
         * try{ -> try keyword u kullanılır.
         *  --> body, hatanın olacağını düşündüşünüz kod bloğunu buraya yazıyorsunuz.
         * }catch(Exception ex){ -> catch, bir istisna olduğu zaman bunu yakalacak olan kısım
         *  --> yakalanan hata, hata türüne göre işleme tabi tutulur. istisnanın türü catch
         *      parantezleri içinde talep edilir.(Exception, RunetimeException v.s.)
         *      Bir hata olduğunda ne yapılması gerektiği burada işlenir.
         * }finaly{ --> hata olsun yada olmasın yürütülmesi gereken işlemler, adımlar var ise bunlar
         *              burada kodlanmalıdır.         *
         * }
         */
        System.out.println("*********************************");
        System.out.println("*******  HESAP MAKİNESİ    ******");
        System.out.println("*********************************");
        System.out.println("1- Toplama");
        System.out.println("2- Cıkartma");
        System.out.println("3- Carpma");
        System.out.println("4- Bölme");
        System.out.println("0- CIKIS");
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen seçiniz.....: ");
        try{
            int secim = sc.nextInt();

        }catch (Exception exception){
            System.out.println("Lütfen rakam giriniz...");
        }


        System.out.println("PROGRAM SONLANDI.");


    }
}