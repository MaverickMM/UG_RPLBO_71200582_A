package com.ug14.rumahsakit;
import java.util.Scanner;
public class Pelayanan {
    private int idPelayan;
    private String nama;

    public Pelayanan(String nama) {
        this.nama = nama;
    }

    public void mengaturJadwal(Pasien pasien, Dokter dokter, Suster suster, Jadwal jadwal){
        jadwal.setDokter(dokter);
        jadwal.setPasien(pasien);
        jadwal.setSuster(suster);
        jadwal.setStatusDaftar(true);

        System.out.println("");


        }




    public Pasien registrasi() {
        System.out.print("Masukkan rm anda : ");
        Scanner rm1 = new Scanner(System.in);
        int rm = rm1.nextInt();

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

        Pasien pasien = new Pasien(rm,nama,usia,alamat,penyakit);

        System.out.println(" ");
        System.out.println("Proses Registrasi Berhasil");


        return pasien;
    }
}
