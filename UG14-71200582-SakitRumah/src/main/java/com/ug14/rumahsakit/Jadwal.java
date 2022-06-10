package com.ug14.rumahsakit;

import com.ug14.rumahsakit.Pelayanan;
import com.ug14.rumahsakit.Suster;

import java.awt.image.PixelGrabber;

public class Jadwal {
    private int IdPemeriksaan;
    private Pasien pasien;
    private Dokter dokter;
    private Suster suster;
    private Pelayanan pelayanan;
    private Boolean statusDaftar = false;
    private Boolean statusScreening = false;

    public Boolean getStatusDaftar() {
        return statusDaftar;
    }

    public Boolean getStatusScreening() {
        return statusScreening;
    }

    public void setStatusDaftar(Boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(Boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public int getIdPemeriksaan() {
        return IdPemeriksaan;
    }

    public void setIdPemeriksaan(int idPemeriksaan) {
        IdPemeriksaan = idPemeriksaan;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Suster getSuster() {
        return suster;
    }

    public void setSuster(Suster suster) {
        this.suster = suster;
    }

    public Pelayanan getPelayanan() {
        return pelayanan;
    }

    public void setPelayanan(Pelayanan pelayanan) {
        this.pelayanan = pelayanan;
    }
}
