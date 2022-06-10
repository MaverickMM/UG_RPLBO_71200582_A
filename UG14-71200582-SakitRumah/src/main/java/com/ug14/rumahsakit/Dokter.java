package com.ug14.rumahsakit;

public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialis;
    private String ruangan;

    public Dokter(String nama, String spesialis, String ruangan) {
        this.nama = nama;
        this.spesialis = spesialis;
        this.ruangan = ruangan;
    }

    public void memeriksa(Pasien pasien, Jadwal jadwal){
        int LevelKurang = pasien.getLevelPenyakit();
        if (pasien.getPenyakit()!= null){
            if (LevelKurang >0) {
                pasien.setLevelpenyakit((LevelKurang - 1));
            }
            else {
                pasien.setStatus(true);
            }

        }else{
            System.out.println("ANDA HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYANAN");
        }
        }



    public void cekStatus(Pasien pasien, Jadwal jadwal){
        boolean stat = pasien.getStatus();
        if (stat==true){
            System.out.println("Pasien sembuh");
            System.out.println("Status anda berhasil diubah");
        }else{
            System.out.println("Pasien masih sakit");
        }
    }


}
