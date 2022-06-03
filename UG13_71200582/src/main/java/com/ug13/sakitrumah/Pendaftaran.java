package com.ug13.sakitrumah;
import java.util.Scanner;
public class Pendaftaran {
    private String nama;

    public Pendaftaran(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pengunjung pengunjung , Pemeriksa pemeriksa , Jadwal jadwal) {
        if(pengunjung.getPenyakit() != null && pengunjung.isStatus()){
            jadwal.setStatusDaftar(true);
            jadwal.setStatusScreening(true);
        }
        System.out.println("Proses Pengaturan Jadwal Berhasil");
    }

    public Pengunjung registrasi() {

        System.out.print("Masukkan nama anda : ");
        Scanner nama1 = new Scanner(System.in);
        String nama = nama1.nextLine();

        System.out.print("Masukkan usia anda : ");
        Scanner usia1 = new Scanner(System.in);
        int usia = usia1.nextInt();

        System.out.print("Masukkan alamat anda : ");
        Scanner alamat1 = new Scanner(System.in);
        String alamat = alamat1.nextLine();

        System.out.print("Masukkan penyakit anda : ");
        Scanner penyakit1 = new Scanner(System.in);
        String penyakit = penyakit1.nextLine();

        Pengunjung pengunjung = new Pengunjung(nama,usia,alamat,penyakit);


        System.out.println(" ");
        System.out.println("Proses Registrasi Berhasil");


        return pengunjung;
    }
}
