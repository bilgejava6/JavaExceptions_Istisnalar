package com.muhammet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner_ExceptionList {

    public static void main(String[] args) {
        /**
         * belli işlemler yapan bir uygulamamız olsun
         */
        int s1,s2,toplam,bolme;
        Scanner sc;
        /**
         * Eğer bir hata yok ise döngüden çıksın
         * eğer bir sorun olmuş ise döngü devam etsin.
         * Hangi kodun nasıl bir istisna fırlatacağını nasıl anlarım. nereden bulurum.
         * kullandığınız method un içine girerek hata fırlatıp, fırlatmadığına bakarsınız.
         * Peki ne arayacağız. (throw new) komutunu aramanız yeterlidir.
         */
        boolean isException;
        do{
            try{
                sc = new Scanner(System.in);
                System.out.print("1. sayıyı giriniz....: ");
                s1 = sc.nextInt();
                System.out.print("2. sayıyı giriniz....: ");
                s2 = sc.nextInt();
                bolme = s1/s2;
                System.out.println("İki sayının bölümü....: "+ bolme);
                isException=false;
            }catch (InputMismatchException exception){
                System.out.println("lütfen rakam giriniz.");
                isException= true;
            }catch (ArithmeticException exception){
                System.out.println("İşlem hatası, lütfen geçerli değerler giriniz.");
                isException=true;
            }catch (Exception exception){
                System.out.println("Beklenmeyen hata. Lütfen bilgiişlem ile iletişime geçiniz.");
                System.out.println("Hata....: "+ exception.toString());
                isException=true;
            }finally {
                System.out.println("Her durumda çalışan kısım");
            }
        }while (isException);

        System.out.println("PROGRAM SONLANDI.");
    }
}
