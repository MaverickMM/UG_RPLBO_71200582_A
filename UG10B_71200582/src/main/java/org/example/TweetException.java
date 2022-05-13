package org.example;

public class TweetException extends Exception{
    private int errCode;
    private String errMessage;

    public TweetException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.errMessage = "Input tweet tidak boleh kosong";
        }
        else if(errCode==2){
            this.errMessage = "Tweet minimal harus terdiri dari 8 karakter dan maksimal 140 karakter";
        }
    }

    public TweetException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(String errorMessage){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}

