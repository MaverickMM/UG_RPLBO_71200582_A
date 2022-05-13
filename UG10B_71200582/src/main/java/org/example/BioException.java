package org.example;

public class BioException extends Exception{
    private int errCode;
    private String errMessage;

    public BioException(int errCode) {
        super();
        this.errCode = errCode;
        if(errCode==1) {
            this.errMessage = "Input bio tidak boleh kosong";
        }
        else if(errCode==2){
            this.errMessage = "Bio minimal harus terdiri dari 5 karakter dan maksimal 30 karakter";
        }
        else if(errCode==3){
            this.errMessage = "Bio tidak boleh mengandung karakter spesial selain titik, et (@), serta spasi";
        }
    }

    public BioException(String errorMessage){
        super(errorMessage);
    }

    public int getErrorCode(String errorMessage){
        return this.errCode;
    }

    public String getErrorMessage(){
        return this.errMessage;
    }
}

