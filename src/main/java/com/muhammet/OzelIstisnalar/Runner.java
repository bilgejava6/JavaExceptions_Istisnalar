package com.muhammet.OzelIstisnalar;

import java.util.Scanner;

public class Runner {
    /**
     * Öğrenci TAkip
     * Öğrenci ekleme, güncelleme, listeleme işlemleri olsun
     * Burada oluşan hataların bize özel olarak tanımlamnmasını sağlayalım.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı gir...: ");
        try{
            int sayi = sc.nextInt();
        }catch (Exception exception){
            throw  new OgrenciException("Bu hata başka hata",ErrorType.ERROR);
        }

        /**
         * bir kullanıcıyı id sine göre aramak.
         * -> aradığın kişi yok
         * -> hata
         * -> beklenmeyen bir durum oldu.
         */


    }



}
