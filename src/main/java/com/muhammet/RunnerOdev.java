package com.muhammet;

public class RunnerOdev {


    public static void main(String[] args) {

        /**
         * ClassCastException
         * IndexOutOfBoundException
         * [1,2,3,5,7] -> size = 5, {0,1,2,3,4}
         * -1 dizi boş demektir.
         * max index -> size-1
         * NullPointerException
         * var olmayan bir değerin içeriğine ulaşmaya çalıştığınızda oluşur.
         * ile ilgili örnekleri içeren bir try bloğu yazınız.
         *
         */
        /**
         *
         */
        try{
            String ifade = "5";
            int sayi = Integer.parseInt(ifade);
            System.out.println("sayi....: "+ sayi);
            Object iiifade = "beş";
            sayi = (int)iiifade;
        }catch (ClassCastException exception){
            System.out.println("Çevirilemez....: "+ exception.toString());
        }

        /**
         *
         */
        try{

        }catch (NullPointerException exception){

        }


    }
}
