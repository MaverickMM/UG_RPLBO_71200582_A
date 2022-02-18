import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pilihan: ");
        

        TabunganKonvensional K_71200582 = new TabunganKonvensional();
        TabunganBerjangka I_71200582 = new TabunganBerjangka();
        

        System.out.println("1.Penyetoran");
        System.out.println("2.Penarikan");
        System.out.println("3.Lihat Saldo");
        System.out.println("Masukan Pilihan: ");
        int pilihan = inp.nextInt();
        
        if (pilihan == 1) {
            K_71200582.penyetoran(200000.0);
            I_71200582.penyetoran(1000000.0);
        }
        else if (pilihan == 2) {
            K_71200582.penarikan(50000.0);
            I_71200582.penarikan(100000.0);
        }
        else if (pilihan == 3) {
            System.out.print("Saldo K_71200582: ");
            K_71200582.getSaldo();
            System.out.print("Saldo I_71200582: ");
            I_71200582.getSaldo();
        }
        else {
            System.out.println("Inputan tidak valid");
        }
    }
}

