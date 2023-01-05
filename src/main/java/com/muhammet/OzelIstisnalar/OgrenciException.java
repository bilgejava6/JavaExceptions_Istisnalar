package com.muhammet.OzelIstisnalar;

/**
 * Kendinize özel bir istisna oluşturmak istiyor ise, Exception sınıflarından miras almalıyız.
 * Constructor mutlaka oluşturun ve kendinize özel hata mesajlarını kullanın.
 *
 */
public class OgrenciException extends RuntimeException{
    private final ErrorType errorType;
    public OgrenciException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public OgrenciException(String message, ErrorType errorType){
        super(message);
        this.errorType = errorType;
    }

    public ErrorType getErrorType(){
        return this.errorType;
    }

}
