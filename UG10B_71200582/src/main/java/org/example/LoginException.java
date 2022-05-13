package org.example;

public class LoginException extends Exception{
    private int errCode;
    private String errMessage;

    public LoginException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.errMessage = "Input username tidak boleh kosong";
        }
        else if(errCode==2){
            this.errMessage = "Input password tidak boleh kosong";
        }
        else if(errCode==3){
            this.errMessage = "Maaf, username atau password salah! Silahkan coba lagi!";
        }
    }

    public LoginException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(String errorMessage){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}

