package com.ug13.sakitrumah;

public class Pemeriksa {
    private String nama;
    private String spesialis;
    private String ruangan;

    public Pemeriksa(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pengunjung pengunjung , Jadwal jadwal){
        if (!pengunjung.isStatus() || !jadwal.isStatusScreening()){
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }
    }

    public void cekStatus(Pengunjung pengunjung){
        if (pengunjung.getLevelPenyakit() >0) {
            pengunjung.setLevelPenyakit(pengunjung.getLevelPenyakit()-1);
            System.out.println("PASIEN ANDA MASIH SAKIT");
        }else{
            System.out.println("SELAMAT PASIEN ANDA SUDAH SEMBUH DAN SEHAT");
        }


    }
}
