package jobsheet9;
import java.util.Scanner;
public class mainSurat11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat11 stack = new stackSurat11(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();

                    stack.push(new surat11(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat masuk berhasil");
                    break;

                case 2:
                    surat11 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat milik " + proses.namaMahasiswa);
                    }
                    break;

                case 3:
                    surat11 top = stack.peek();
                    if (top != null) {
                        System.out.println("Surat terakhir dari: " + top.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Cari nama: ");
                    String cari = sc.nextLine();
                    if (stack.search(cari)) {
                        System.out.println("Surat ditemukan");
                    } else {
                        System.out.println("Tidak ditemukan");
                    }
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}