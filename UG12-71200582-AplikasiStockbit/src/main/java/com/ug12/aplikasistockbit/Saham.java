package com.ug12.aplikasistockbit;

public class Saham {

        private String kode;
        private long harga;

        public Saham(String kode,long harga){
            this.harga = harga;
            this.kode = kode;

        }

    public String getKode() {
        return kode;
    }

    public long getHarga() {
        return harga;
    }
}


