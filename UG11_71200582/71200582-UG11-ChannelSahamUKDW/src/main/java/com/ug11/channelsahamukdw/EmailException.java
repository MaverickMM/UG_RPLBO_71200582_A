package com.ug11.channelsahamukdw;

public class EmailException extends Exception {
    private String errorMessage;
    private int errorCode;

    EmailException(int errorCode){
        super();
        this.errorCode = errorCode;
        if(errorCode==1) {
            this.errorMessage = "Login gagal! Email Anda tidak terdaftar dalam UKDW";
        }
        else if(errorCode==2){
            this.errorMessage = "Email UKDW anda tidak valid.";
        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }


}
