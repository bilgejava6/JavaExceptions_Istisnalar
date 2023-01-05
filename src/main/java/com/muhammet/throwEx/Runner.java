package com.muhammet.throwEx;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("kümes numarasını giriinz....: ");
        int kumesNo = sc.nextInt();
        System.out.print("Yumurta sayısı.....: ");
        YumurtaUretim yy = YumurtaUretim.Init();
        System.out.println(yy.yumurtaSay(kumesNo));

        /**
         * Checked Exception methodları nasıl sarmalarız??
         * 1- bulunduğunuz method un aynı istisnayı fırlatmasını sağlayarak
         * public static void main(String[] args) throws  Exception
         * 2- ilgili method u try..catch e alarak sarmalarsınız
         */
        try {
            yy.yumurtaSayChecked(kumesNo);
        }catch (Exception exception){

        }



    }
}
