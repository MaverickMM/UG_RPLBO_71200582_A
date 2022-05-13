package org.example;

public class UsernameException extends Exception{
    private int errCode;
    private String errMessage;

    public UsernameException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.errMessage = "Username tidak boleh kosong!";
        }
        else if(errCode==2){
            this.errMessage = "Username minimal harus terdiri dari 6 karakter";
        }
        else if(errCode==3){
            this.errMessage = "Username hanya boleh terdiri dari huruf, angka, dan simbol underscore";
        }
    }

    public UsernameException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(String errorMessage){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}
