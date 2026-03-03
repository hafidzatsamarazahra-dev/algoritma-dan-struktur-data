package kuis1;
import java.util.Scanner;

public class kafeMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("========================");
        System.out.println("1. nasi goreng: 10000");
        System.out.println("2. nasi padang: 15000");
        System.out.println("3. air putih: 5000");

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        kafe11[] arrayOfKafe = new kafe11[jumlah];

        System.out.print("Masukkan nama pemesan: ");
        String nama = sc.nextLine();

        int totalHarga = 0;

        for(int i = 0; i < jumlah; i++){
            arrayOfKafe[i] = new kafe11();

            System.out.print("Kode menu yang dipesan: ");
            int menu = sc.nextInt();

            int harga = 0;

            switch(menu){
                case 1:
                    System.out.println("nasi goreng: 10000");
                    harga = 10000;
                    break;
                case 2:
                    System.out.println("nasi padang: 15000");
                    harga = 15000;
                    break;
                case 3:
                    System.out.println("air putih: 5000");
                    harga = 5000;
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }

            totalHarga += harga;

            arrayOfKafe[i].tambahData(nama, harga);
        }

        System.out.println("\n===== DATA PEMBELI =====");
        for(int i = 0; i < jumlah; i++){
            arrayOfKafe[i].tampilkanInfo();
            System.out.println("----------------------");
        }

        System.out.println("Total yang harus dibayar: " + totalHarga);
    }
}