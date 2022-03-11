package com.ug5b.soal1;

public class Voucher {
    private String kode;
    private long nominal;

    public String getKode() {
        return kode;
    }

    public void setNominal(long nominal) {
        this.nominal = nominal;
    }


//    • Apabila nominal ≤ 0, maka kode yang akan disimpan yaitu “VC”.
//    • Apabila nominal > 0, maka kode yang akan disimpan yaitu “VC”+nominal.
    public void buatVoucher() {
    if (nominal <= 0){
        kode = "VC";
    }
    else {
        kode = "VC"+nominal;
    }
    }


}
