package com.ug12.aplikasistockbit;



import java.util.*;
import java.util.Map.Entry;

    public class Stockbit {
        private ArrayList<Investor> arrInvestor = new ArrayList<Investor>();
        private Investor investor;

        public Stockbit() {

        }

        public void login(String username, String password){
            Boolean LoginVerify = false;
            for(Investor i : arrInvestor){
                if (i.getUsername().equals(username) && i.getPassword().equals(password)){
                    this.investor = i;
                    System.out.println("Login berhasil!");
                    LoginVerify = true;
                    break;
                }
            }
            if (!LoginVerify){
                System.out.println("Username/password Anda salah!");
            }
        }


        public void register(Investor investor){

            arrInvestor.add(investor);
            System.out.println("Registrasi akun atas nama "+investor.getNama()+" sukses!");

        }



        public void printPortfolio() {
            String name = investor.getNama();
            int counter = 1;
            long totalsemua = 0;
            System.out.println("==========Portofolio Client==========");
            System.out.println("Client: "+ name);
            System.out.println("No.  Kode Saham \t Jumlah Lot \t Harga \t   Sub Total ");

            for (Entry<Saham, Integer> i : investor.getPortofolio().entrySet()){

                long total = i.getValue() * 100 * i.getKey().getHarga();
                totalsemua += total;
                System.out.println(counter + ".  " + i.getKey().getKode() + "\t         "+i.getValue() +"x"
                        + "\t             " +i.getKey().getHarga() + "\t    " + total);
                counter ++;
            }
            System.out.println("Total Investasi: Rp"+totalsemua);
            System.out.println("");
        }

        public void orderBeli(Saham saham, int lot) {

            investor.getPortofolio().put(saham, lot);
            System.out.println("Order beli "+saham.getKode()+" sebanyak "+lot+" lot sukses!");
        }

        public void orderJual(Saham saham, int lot) {
            int temp = investor.getPortofolio().get(saham) - lot;
            if(investor.getPortofolio().get(saham) > lot){

            investor.getPortofolio().put(saham, temp);
                System.out.println("Order Jual "+saham.getKode()+" sebanyak "+lot+" lot sukses!");
            }
            else if(investor.getPortofolio().get(saham) == lot){
                investor.getPortofolio().put(saham, temp);
                System.out.println("Order Jual "+saham.getKode()+" sebanyak "+lot+" lot sukses!");
                investor.getPortofolio().remove(saham);

            }
            else{
                System.out.println("Order Jual gagal!");
            }

        }
    }
