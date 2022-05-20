package com.ug11.kalkulasipersentase;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{

    public static void main( String[] args )
    {


        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan teks: ");
        String test = inp.nextLine();



        String strPattern = "([1-9].[1-9]+%)";

        Pattern p = Pattern.compile(strPattern);
        Matcher m = p.matcher(test);
        System.out.print("Rincian Perhitungan: ");
        int count = 0;
        double number = 0;
        test = "";
        while (m.find()) {

            count++;
            test += m.group(1)+" + ";

            number += Double.parseDouble(m.group(1).substring(0,m.group().length()-1));


        }
        System.out.print(test.substring(0,test.length()-2));
//        System.out.print(m.group(1)+" + ");
// Saham #BBRI naik sebanyak 4.25% disusul dengan saham #BBCA yang naik sebanyak 1.25%

        System.out.println();
        System.out.print("Total kenaikan (Dalam persen): " + number+"%");
    }
}
