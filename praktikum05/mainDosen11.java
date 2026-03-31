package praktikum05;

import java.util.Scanner;

public class mainDosen11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen11 list = new dataDosen11();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Kode: ");
                    String kode = sc.nextLine();

                    System.out.print("Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk = sc.nextLine();

                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    dosen11 d = new dosen11(kode, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.SortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("Data berhasil diurutkan dengan Insertion Sort (ASC)");
                    list.tampil();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(pilih != 0);
    }
}