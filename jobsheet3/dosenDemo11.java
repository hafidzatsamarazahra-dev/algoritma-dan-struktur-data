package jobsheet3;

import java.util.Scanner;

public class dosenDemo11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        dosen11[] arrayOfDosen = new dosen11[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jenisKelamin = sc.nextLine();

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrayOfDosen[i] = new dosen11(kode, nama, jenisKelamin, usia);
        }

        dataDosen11 data = new dataDosen11();

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        data.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== RERATA USIA DOSEN PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        data.infoDosenPalingTua(arrayOfDosen);
        data.infoDosenPalingMuda(arrayOfDosen);
    }
}