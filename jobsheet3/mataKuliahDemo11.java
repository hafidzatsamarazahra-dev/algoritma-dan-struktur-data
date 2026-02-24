package jobsheet3;
import java.util.Scanner;

public class mataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        mataKuliah11[] arrayOfMataKuliah = new mataKuliah11[jumlah];
        String kode, nama, dummy;
        int sks, jumlahJam;
        for(int i = 0; i < arrayOfMataKuliah.length; i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            arrayOfMataKuliah[i] = new mataKuliah11();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("--------------------------------");
        }
        for(int i = 0; i < arrayOfMataKuliah.length; i++){
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("--------------------------------");
        }
    }
}