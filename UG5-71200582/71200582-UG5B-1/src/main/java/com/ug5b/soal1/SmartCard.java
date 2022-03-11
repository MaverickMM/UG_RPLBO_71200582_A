package com.ug5b.soal1;

public class SmartCard {
    private String nama;
    private long saldo;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }


    public long getSaldo() {
        return saldo;
    }

//• Apabila kode voucher sama dengan “VC”, maka top up akan gagal.
//• Apabila kode voucher sama dengan “VC”+nominal, maka saldo pada Smart Card
    public void topUp(Voucher vch) {
        if (vch.getKode().equals("VC")){
            System.out.println("Kode Voucher : " + vch.getKode() + " || Top up gagal! kode voucher tidak valid.");
        }else{
            long number;
            number = Long.parseLong(vch.getKode().substring(2));
            this.setSaldo(number);
            System.out.println("Kode Voucher : " + vch.getKode() + " || Top up sukses!");
        }
    }
}
