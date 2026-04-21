package studiKasus1;
import java.util.Scanner;

public class mainPeminjaman11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataPeminjaman11 list = new dataPeminjaman11();

        mahasiswa11 m1 = new mahasiswa11("22001","Andi","Teknik Informatika");
        mahasiswa11 m2 = new mahasiswa11("22002","Budi","Teknik Informatika");
        mahasiswa11 m3 = new mahasiswa11("22003","Citra","Sistem Informasi Bisnis");

        buku11 b1 = new buku11("B001","Algoritma",2020);
        buku11 b2 = new buku11("B002","Basis Data",2019);
        buku11 b3 = new buku11("B003","Pemrograman",2021);
        buku11 b4 = new buku11("B004","Fisika",2024);

        list.tambah(new peminjaman11(m1, b1, 7));
        list.tambah(new peminjaman11(m2, b2, 3));
        list.tambah(new peminjaman11(m3, b3, 10));
        list.tambah(new peminjaman11(m3, b4, 6));
        list.tambah(new peminjaman11(m1, b2, 4));

        int pilih;

        do{
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan berdasarkan NIM (ASC)");
            System.out.println("5. Cari berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    mahasiswa11[] daftarMhs = {
                        new mahasiswa11("22001","Andi","Teknik Informatika"),
                        new mahasiswa11("22002","Budi","Teknik Informatika"),
                        new mahasiswa11("22003","Citra","Sistem Informasi Bisnis"),
                    };
                    System.out.println("\n=== DATA MAHASISWA ===");
                    for(mahasiswa11 m : daftarMhs){
                        m.tampilMhs();
                        System.out.println();
                    }
                    break;

                case 2:
                    buku11[] daftarBuku ={
                        new buku11("B001","Algoritma",2020),
                        new buku11("B002","Basis Data",2019),
                        new buku11("B003","Pemrograman",2021),
                        new buku11("B004","Fisika",2024),
                    };
                    System.out.println("\n=== DATA BUKU ===");
                    for(buku11 n : daftarBuku){
                        n.tampilBuku();
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("\n=== DATA PEMINJAMAN ===");
                    list.tampil();
                    break;

                case 4:
                    // for(int i = 0; i < list.idx; i++){
                    //     list.dataPeminjaman[i].hitungDenda();
                    // }

                    list.sortingASC();

                    System.out.println("\n=== DATA PEMINJAMAN (URUT NIM) ===");
                    for(int i = 0; i < list.idx; i++){
                        list.dataPeminjaman[i].mhs.tampilMhs();
                        System.out.println();
                    }
                    break;


                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nimCari = sc.nextLine();

                    list.tampilNIM(nimCari);
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