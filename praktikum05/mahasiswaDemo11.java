package praktikum05;

import java.util.Scanner;

public class mahasiswaDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswaBerprestasi11 list = new mahasiswaBerprestasi11();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<jumlah; i++){
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

            mahasiswa11 m = new mahasiswa11(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting:");
        list.tampil();

        System.out.println("\nData setelah sorting (DESC):");
        list.bubblesort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan SELECTION SORT(ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
    }
}