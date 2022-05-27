package com.ug12.aplikasistockbit;
import java.util.*;

public class Investor {

    private String username;
        private String password;
        private HashMap<Saham,Integer> portofolio = new HashMap<Saham,Integer>();
        private String nama;

    public Investor(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public HashMap<Saham, Integer> getPortofolio() {
        return portofolio;
    }


    public String getNama() {
        return nama;
    }
}
