package com.ug14.rumahsakit;

public class Pasien {
    private int rm;
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelpenyakit = 3;

    private Boolean status = false;

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public Pasien(int rm, String nama, int usia, String alamat, String penyakit) {
        this.rm = rm;
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
        this.penyakit = penyakit;
    }


    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }

    public int getLevelPenyakit() {
        return levelpenyakit;
    }

    public void setLevelpenyakit(int levelpenyakit) {
        this.levelpenyakit = levelpenyakit;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
