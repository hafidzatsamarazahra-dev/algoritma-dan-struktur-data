package jobsheet3;
import java.util.Scanner;
public class mataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah11[]arrayOfMataKuliah = new mataKuliah11[3];
        String kode,nama,dummy;
        int sks,jumlahJam;
        
        for(int i=0;i<3;i++){
             System.out.println("Masukkan Data Mataa kuliah ke-" + (i+1));
            System.out.print("kode   :");
            kode = sc.nextLine();
            System.out.print("Nama  :");
            nama = sc.nextLine();
            System.out.print("sks :");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("jumlah jam   :");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("--------------------------------");

            arrayOfMataKuliah[i] = new mataKuliah11(kode,nama,sks,jumlahJam);
        }
    }
    
}
