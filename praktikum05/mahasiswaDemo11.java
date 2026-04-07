package praktikum05;

import java.util.Scanner;

public class mahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        mahasiswaBerprestasi11 list = new mahasiswaBerprestasi11();
        list.listMhs = new mahasiswa11[jumMhs];

        for(int i=0; i<jumMhs; i++){
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("Kelas: ");
            String kelas = sc.nextLine();

            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("--------------------------------------");
            mahasiswa11 m = new mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        // System.out.println("\nData sebelum sorting:");
        // list.tampil();

        // System.out.println("\nData setelah sorting (DESC):");
        // list.bubblesort();
        // list.tampil();

        // System.out.println("data yang sudah terurut menggunakan SELECTION SORT(ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        // list.insertionSort();
        // list.tampil();

        list.tampil();
        System.out.println("------------------------------------------------");
        System.out.println("pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        // System.out.println("menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss= (int)posisi;
        // list.tampilPosisi(cari,pss);
        // list.tampilDataSearch(cari,pss);

        System.out.println("----------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari,pss2);
        list.tampilDataSearch(cari,pss2);
    }
}