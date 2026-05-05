package pertemuan11;
import java.util.Scanner;
public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queueLinkedList11 q = new queueLinkedList11();

        int pilih;
        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Terdepan & Terakhir");
            System.out.println("4. Tampilkan Semua");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
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
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    q.enqueue(new mahasiswaTugas11(nim, nama, kelas, ipk));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peekFront();
                    q.peekRear();
                    break;
                case 4:
                    q.tampilSemua();
                    break;
                case 5:
                    q.jumlahAntrian();
                    break;
                case 6:
                    q.clear();
                    break;
            }
        } while (pilih != 0);
    }
}
    