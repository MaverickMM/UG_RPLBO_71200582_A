package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    static boolean valid = true;
    static boolean valid1 = true;
    static boolean valid2 = true;
    static boolean valid3 = true;


    public static void main(String[] args) {

        User user = new User("u704755", "p704755");
        while (valid) {
            Scanner inp = new Scanner(System.in);
            System.out.print("Nama pengguna: ");
            String username = inp.nextLine();

            Pattern p = Pattern.compile("^[a-zA-Z0-9_]{0,}$");
            Matcher m = p.matcher(username);
            boolean b = m.matches();

            try {
                if (username.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username.length() < 6) {
                    throw new UsernameException(2);
                } else if (!b) {
                    throw new UsernameException(3);
                }

            } catch (UsernameException e) {

                System.out.println("Error : " + e.getErrorMessage());
//            e.printStackTrace();

            }


            System.out.print("Password: ");
            String password = inp.nextLine();

            try {

                if (username.isEmpty()) {
                    throw new LoginException(2);
                } else if (!password.equals(user.getPassword()) || !username.equals(user.getUsername())) {
                    throw new LoginException(3);
                } else {
                    valid = false;
                }

            } catch (LoginException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }

        while (valid1) {
            System.out.println("Selamat datang di Twitter, " + user.getUsername());
            System.out.println("Kamu diminta untuk mengganti username, silahkan masukan username kamu");
            Scanner inp1 = new Scanner(System.in);
            System.out.print("Username: ");
            String username1 = inp1.nextLine();

            Pattern p = Pattern.compile("^[a-zA-Z0-9_]{0,}$");
            Matcher m = p.matcher(username1);
            boolean b = m.matches();
            try {
                if (username1.isEmpty()) {
                    throw new UsernameException(1);
                } else if (username1.length() < 6) {
                    throw new UsernameException(2);
                } else if (!b) {
                    throw new UsernameException(3);
                }else {
                    valid1 = false;
                }
            } catch (UsernameException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }


            user.setUsername(username1);
        }
        String bio = null;
        while (valid2) {
            System.out.println("Username kamu berhasil diperbaharui, " + user.getUsername());
            System.out.println("Maaf, " + user.getUsername() + " kamu juga diminta  untuk mengisi bio, silahkan masukan bio kamu");
            Scanner inp2 = new Scanner(System.in);
            System.out.print("Bio: ");
            bio = inp2.nextLine();

            Pattern p1 = Pattern.compile("^[a-zA-Z0-9.@ ]{0,}$");
            Matcher m1 = p1.matcher(bio);
            boolean b1 = m1.matches();

            try {
                if (bio.isEmpty()) {
                    throw new BioException(1);
                } else if (bio.length() < 5 || bio.length() > 30) {
                    throw new BioException(2);
                } else if (!b1) {
                    throw new BioException(3);
                }
                else {
                    valid2 = false;
                }
            } catch (BioException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }

        }
        System.out.println("Bio kamu berhasil diperbaharui, " + user.getUsername());
        System.out.println("Selamat, " + user.getUsername() + " kamu sudah dapat memposting tweet pertama kamu");
        String tweet = null;
        while (valid3) {


            Scanner inp3 = new Scanner(System.in);
            System.out.print("Tweet: ");
            tweet = inp3.nextLine();


            try {
                if (tweet.isEmpty()) {
                    throw new TweetException(1);
                } else if (tweet.length() < 8 || tweet.length() > 140) {
                    throw new TweetException(2);
                }else {
                    valid3 = false;
                }
            } catch (TweetException e) {
                System.out.println("Error : " + e.getErrorMessage());
            }
        }
        System.out.println(user.getUsername() + ": " + tweet);
        System.out.println(" ");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Bio: " + bio);

    }
        }



