package com.ug5b.soal2;

public class Buku {
    private String kode;
    private static int nextNum = 0;
    private String judul;
    private String penulis;
    private long harga;
    private int stok;
    public Buku(String argjudul, String argpenulis, long argharga, int argstok) {
        kode = "NV24510";
        nextNum++;
        this.judul = argjudul;
        this.penulis = argpenulis;
        this.harga = argharga;
        this.stok = argstok;
        kode = kode + nextNum;

    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
