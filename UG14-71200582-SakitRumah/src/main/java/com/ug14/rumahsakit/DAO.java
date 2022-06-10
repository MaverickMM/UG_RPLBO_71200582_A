package com.ug14.rumahsakit;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DAO {
    String user="root";
    String pwd="";
    String host="localhost";
    String db="java_input";
    String urlValue="jdbc:mysql://"+host+"/"+db+"?user="+user+"&password="+pwd;

    public Connection connect() {
         Connection conn = null;
         try {
            // create a connection to the database
             conn = DriverManager.getConnection(urlValue);

             System.out.println("Koneksi berhasil.");

             } catch (SQLException e) {
             System.out.println(e.getMessage());
             } finally {
            try {
                 if (conn != null) {
                     conn.close();
                     }
                 } catch (SQLException ex) {
                 System.out.println(ex.getMessage());
                 }
             }
        return conn;
        }

   public int getDokterByID(){
       PreparedStatement statement = conn.prepareStatement(sql,
               Statement.RETURN_GENERATED_KEYS);

       statement.execute();

       PreparedStatement ps = connection
               .prepareStatement("select your_table_id_sequence.currval from dual");

       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
           generatedKey = (int) rs.getLong(1);
       }

       System.out.println("Inserted record's ID: " + generatedKey);

   }
   public int getSusterByID(){
       PreparedStatement statement = conn.prepareStatement(sql,
               Statement.RETURN_GENERATED_KEYS);

       statement.execute();

       PreparedStatement ps = connection
               .prepareStatement("select your_table_id_sequence.currval from dual");

       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
           generatedKey = (int) rs.getLong(1);
       }

       System.out.println("Inserted record's ID: " + generatedKey);
   }
   public int getPelayananByID(){
       PreparedStatement statement = conn.prepareStatement(sql,
               Statement.RETURN_GENERATED_KEYS);

       statement.execute();

       PreparedStatement ps = connection
               .prepareStatement("select your_table_id_sequence.currval from dual");

       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
           generatedKey = (int) rs.getLong(1);
       }

       System.out.println("Inserted record's ID: " + generatedKey);
   }
    public int inputPasien(Pasien pasien) {
        BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));


        try {


            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(urlValue);
            PreparedStatement pStatement = null;

            String sql = "INSERT INTO Pasien(nama_mk)"+"VALUES (?);";
            pStatement = conn.prepareStatement(sql);


            System.out.print("Masukan Nama Pasien: ");
            String nama_mk = inputUser.readLine();
            pStatement.setString(1, nama_mk);


            int intBaris = pStatement.executeUpdate();
            if (intBaris > 0) {
                System.out.println("Berhasil menambahkan data");
            } else {
                System.out.println("Penambahan data gagal");
            }


            pStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal" + e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver tidak di temukan");

        }
        return 0;
    }


    public int inputJadwal(Jadwal jadwal){
        BufferedReader inputUser = new BufferedReader (new InputStreamReader (System.in));



        try{


        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(urlValue);
        PreparedStatement pStatement = null;

        String sql = "INSERT INTO jadwal(nama_mk)"+"VALUES (?);";
        pStatement = conn.prepareStatement(sql);


        System.out.print("Masukan Nama Jadwal: ");
        String nama_mk = inputUser.readLine();
        pStatement.setString(1, nama_mk);


        int intBaris=pStatement.executeUpdate();
        if (intBaris>0) {
        System.out.println("Berhasil menambahkan data");
        } else {
        System.out.println("Penambahan data gagal"); }



        pStatement.close();
        conn.close();
        } catch (SQLException e) {
        System.out.println("Koneksi Gagal"+e.toString());
        } catch(ClassNotFoundException e) {
        System.out.println("JDBC Driver tidak di temukan");

        }
    }
    public void getPasienSembuh(){
        String query = "SELECT * FROM Pasien";
        
    }

}
