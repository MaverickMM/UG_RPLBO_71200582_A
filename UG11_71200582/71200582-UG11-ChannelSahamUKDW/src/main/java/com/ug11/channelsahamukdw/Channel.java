package com.ug11.channelsahamukdw;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Channel{
    private String email;
    private String namaDepan;
    private String namaBelakang;
    private int totalTag = 0;


    public Channel() {

    }

    public void login(String email) throws EmailException {
        this.email = email;
        StringTokenizer st = new StringTokenizer(email, "@");



        String s2 = st.nextToken();
        int count = s2.length();
        String output = email.substring(count);




        Pattern p = Pattern.compile("^[A-Za-z]+\\.[A-Za-z]+$");
        Matcher m = p.matcher(s2);
        boolean b = m.matches();

        boolean valid = true;

            try {
                if (!output.equals("@students.ukdw.ac.id")) {
                    throw new EmailException(1) ;
                } else if (!b) {
                    throw new EmailException(2);
                }
            } catch (EmailException e) {
                System.out.println("Error : " + e.getErrorMessage());
                valid = false;

            }
        if(valid){
            System.out.println("Login Berhasil!");


            StringTokenizer nd = new StringTokenizer(s2, ".");
            String ndepan = nd.nextToken();
            int count1 = ndepan.length();

            String outputnama = s2.substring((count1));

            setNamaDepan(ndepan.toUpperCase());
            setNamaBelakang(outputnama.toUpperCase().substring(1));
        }




    }
    public void bagikanIde(String ide) {

        String strPattern = "(#\\w+)";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(ide);
        System.out.println("Ide: "+ ide);
        int count = 0;
        System.out.print("Saham yang anda tag: ");
        while (m.find()) {

            count++;
            System.out.print(m.group(1)+" ");
        }
        if(count == 0){
            System.out.print("-");
        }
        System.out.println();

        System.out.println("Total saham yang Anda tag: "+ count);
        int nilai = getTotalTag();
        setTotalTag(nilai+count);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaDepan() {
        return namaDepan;
    }

    public void setNamaDepan(String namaDepan) {
        this.namaDepan = namaDepan;
    }

    public String getNamaBelakang() {
        return namaBelakang;
    }

    public void setNamaBelakang(String namaBelakang) {
        this.namaBelakang = namaBelakang;
    }

    public int getTotalTag() {
        return totalTag;
    }

    public void setTotalTag(int totalTag) {
        this.totalTag = totalTag;
    }

    public void printInfo() {
        System.out.println("Nama Depan: "+ getNamaDepan());
        System.out.println("Nama Belakang: "+ getNamaBelakang());
        System.out.println("Email: "+ getEmail());
        System.out.println("Total tag: "+ getTotalTag());
    }
}

