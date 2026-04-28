package tugasJobsheet10;
import java.util.Scanner;
public class mainKRS11 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            antrianKRS11 antrian = new antrianKRS11(10);
            int pilih;

            do {
                System.out.println("\n--- SISTEM ANTRIAN KRS (DPA) ---");
                System.out.println("1. Tambah Antrian");
                System.out.println("2. Proses 2 Mahasiswa");
                System.out.println("3. Lihat Semua Antrian");
                System.out.println("4. Lihat 2 Terdepan");
                System.out.println("5. Lihat Antrian Terakhir");
                System.out.println("6. Cetak Statistik Antrian");
                System.out.println("7. Kosongkan Antrian");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilih = sc.nextInt();
                sc.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("NIM: "); 
                        String nim = sc.nextLine();
                        System.out.print("Nama: "); 
                        String nama = sc.nextLine();
                        System.out.print("Prodi: "); 
                        String prodi = sc.nextLine();
                        System.out.print("Kelas: "); 
                        String kelas = sc.nextLine();
                        antrian.tambahAntrian(new mahasiswa11(nim, nama, "IT", "1A"));
                        break;
                    case 2: antrian.prosesKRS(); break;
                    case 3: antrian.tampilkanSemua(); break;
                    case 4: antrian.lihat2Terdepan(); break;
                    case 5: antrian.lihatAkhir(); break;
                    case 6: antrian.cetakStats(); break;
                    case 7: antrian.clear(); break;
                }
            } while (pilih != 0);
        }
}