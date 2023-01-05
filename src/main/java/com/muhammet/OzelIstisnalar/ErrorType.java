package com.muhammet.OzelIstisnalar;

public enum ErrorType {
    ERROR(4000,"Hata"),
    ERROR_NOTFOUND_BYID(4001,"Aradığınız öğrenci id si bulunamadı"),
    ERROR_EMPTY(4002,"Öğrenci listesi boş"),
    ERROR_DONT_CREATE(4003,"Öğrenci ekelenemedi"),
    ERROR_INVALID_PARAMETER(4004,"Geçersiz öğrenci bilgisi girdiniz.");

    private int code;
    private String message;

    ErrorType(){}
    ErrorType(int code,String message){
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
