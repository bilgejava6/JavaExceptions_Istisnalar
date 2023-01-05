package com.muhammet.throwEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class YumurtaUretim {
    private static final int kumesSayisi = 23;
    /**
     * Integer -> KumesNo
     * Integer -> Kumesteki Yumurta Sayısı
     */
    private Map<Integer,Integer> yumurtaSayisi;
    private int gunlukYumurtaUretim;
    private int tavukSayisi = 3460;

    /**
     * Burada constructor private yapılarak bu sınıftan bir nesne türetilmesinin önüne geçiyorum.
     */
    private YumurtaUretim(){

    }

    public static YumurtaUretim Init(){
        /**
         * Bu sınıftan bir nesne oluşturarak, döneceği için bunu direkt erişime
         * statik olarak açıyorum.
         */
        YumurtaUretim yumurtaUretim = new YumurtaUretim();
        yumurtaUretim.yumurtaSayisi = new HashMap<>();
        Random random = new Random();
        for(int i=0;i<kumesSayisi;i++){
            int yumurtaAdedi = random.nextInt(100);
            yumurtaUretim.yumurtaSayisi.put(i,yumurtaAdedi);
        }
        return yumurtaUretim;
    }

    /**
     * DİKKAT!!!!!!
     * Checked & UnChecked Exception
     * UnChecked Exception -> bşr method hata fırlatabilir ancak bunu kontrol etmek zorunda değiliz, isteğe bağlıdır.
     * Sorun olmayan bir kümesten değer dönemezsiniz.
     * @param kumesNumarasi
     * @return
     */
    public int yumurtaSay(int kumesNumarasi){
        if(kumesNumarasi<0 || kumesNumarasi>=kumesSayisi){
            /**
             * YANLIŞ KULLANIM
             *  System.out.println("Lütfen 0 ile "+kumesSayisi+" arasında bir değer giriniz...");
             *  return 0;
             *  DOĞRU OLAN,
             *  Özelleştirilmiş istisna fırlatmaktır.
             *  Özel istisna fırlatma
             *  1. adım -> throw new
             *  2. adım -> istisnanın türünü yazıyorsunuz.
             *  3. adım -> vermek istediğiniz mesajı yazıyorsunuz.
             */
            throw new ArithmeticException("Girmiş olduğunuz kümes bilgisi yanlıştır. lütfen 0 ile "+ kumesSayisi+" arasında bir değer giriniz");
        }else
            return yumurtaSayisi.get(kumesNumarasi);
    }
    /**
     * Checked Exception
     * bu method u kullanacak yazılımcıların mutlaka bu method u sarmalamaları veya istisna fırlatmaları gereken durumlardır.
     * @param kumesNumarasi
     * @return
     * @throws Exception
     */
    public int yumurtaSayChecked(int kumesNumarasi)throws Exception{
        if(kumesNumarasi<0 || kumesNumarasi>=kumesSayisi){
            /**
             * YANLIŞ KULLANIM
             *  System.out.println("Lütfen 0 ile "+kumesSayisi+" arasında bir değer giriniz...");
             *  return 0;
             *  DOĞRU OLAN,
             *  Özelleştirilmiş istisna fırlatmaktır.
             *  Özel istisna fırlatma
             *  1. adım -> throw new
             *  2. adım -> istisnanın türünü yazıyorsunuz.
             *  3. adım -> vermek istediğiniz mesajı yazıyorsunuz.
             */
            throw new Exception("Girmiş olduğunuz kümes bilgisi yanlıştır. lütfen 0 ile "+ kumesSayisi+" arasında bir değer giriniz");
        }else
            return yumurtaSayisi.get(kumesNumarasi);
    }
}
