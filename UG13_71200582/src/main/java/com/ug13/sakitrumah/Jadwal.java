package com.ug13.sakitrumah;

import java.awt.image.PixelGrabber;

public class Jadwal {
    private Pengunjung pengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private boolean statusDaftar = false;
    private boolean statusScreening = false;

    public Jadwal() {
//        if(this.pengunjung.getPenyakit() != null){
//            this.statusDaftar = true;
//            this.statusScreening = true;
//        }

    }

    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    public boolean isStatusScreening() {
        return statusScreening;
    }

    public void setStatusDaftar(boolean statusDaftar) {
        this.statusDaftar = statusDaftar;
    }

    public void setStatusScreening(boolean statusScreening) {
        this.statusScreening = statusScreening;
    }

    public Pengunjung getPengunjung() {
        if (pengunjung == null){
            return pengunjung;
        }
        return pengunjung;
    }

    public Pemeriksa getPemeriksa() {
        return pemeriksa;
    }

    public Perawat getPerawat() {
        return perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }
}
