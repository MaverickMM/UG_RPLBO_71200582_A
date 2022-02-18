import java.util.*;
public class hitungGaji_71200582_A {
    

    public static void main(String[] args) {

        
        Scanner inp = new Scanner(System.in);
        System.out.print("Berapa karyawan: ");
        int jmlLoop = inp.nextInt(); //jumlah karyawan yang ingin dicek gajinya
        

        for (int i=1;i<=jmlLoop;i++){
            int totJamKerja1 = 0;
            int delapan = 8;
            float Payments = 0;
            float potongan = 0;
            float Total = 0;

            System.out.print("Masukan jumlah jam kerja: ");
            float totJamKerja = inp.nextInt(); //total jam kerja karyawan
            totJamKerja1 += totJamKerja;

        
            if (totJamKerja1 == 8){
                Total = 300000;
                System.out.println("Total: "+Total);
                System.out.println("-------------------------");
                Total = 0;

            }
            else if (totJamKerja1 < 8){
                Total = 300000;
                
                delapan -= totJamKerja1 ;
                for (float j=1;j<=delapan;j++){
                    Total -= 15000;
                    potongan += 15000;
                }
                System.out.println("Less Hours: "+delapan);
                System.out.println("potongan: "+potongan);
                System.out.println("Total: "+Total);
                System.out.println("-------------------------");
                Total = 0;
            }
            else{
                Total = 300000;
                totJamKerja1 -= delapan;
                for (float j=1;j<=totJamKerja1;j++){
                    Payments += 15000;
                }
                Total += Payments;
                System.out.println("Extra Jam: "+totJamKerja1);
                System.out.println("Extra Payments: "+Payments);
                System.out.println("Total: "+Total);
                System.out.println("-------------------------");
                Total = 0;
            }
        }
        
    }
    
}

