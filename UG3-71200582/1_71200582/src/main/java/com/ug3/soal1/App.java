package com.ug3.soal1;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("====================absensi karyawan====================");
        System.out.println("Absen disini");

        System.out.println("Nama karyawan: ");
        String name=input.nextLine();

        LocalDate Tanggal = LocalDate.now();
        DateTimeFormatter Tanggal1 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        String Buat_Tanggal = Tanggal.format(Tanggal1);

        LocalTime Waktu = LocalTime.now();
        DateTimeFormatter Waktu1 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        String Buat_Waktu = Waktu.format(Waktu1);

        System.out.println("Atas nama : " + name);
        System.out.println("Pada tanggal: " + Buat_Tanggal);
        System.out.println("Pukul: " + Buat_Waktu);
    }
}
