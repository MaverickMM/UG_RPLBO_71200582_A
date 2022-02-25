package com.ug3.soal2;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int merah = 20;
        int kuning = 2;
        int hijau = 15;
        while (true) {
            System.out.print("lampu merah menyala selama\n");
            for (int i = merah; i != 0; i--) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\nAkan berganti ke lampu kuning\n\n");
            System.out.print("Lampu kuning menyala selama\n");
            for (int i = kuning; i != 0; i--) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n\nAkan berganti ke lampu hijau\n\n");
            System.out.print("Lampu hijau menyala selama\n");
            for (int i = hijau; i != 0; i--) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\n\nAkan berganti ke lampu kuning\n");
            System.out.print("Lampu kuning menyala selama\n");
            for (int i = kuning; i != 0; i--) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.print("\n\nAkan berganti ke lampu merah\n\n");


        }
    }
}
