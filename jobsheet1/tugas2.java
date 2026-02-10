package jobsheet1;
import java.util.Scanner;

public class tugas2{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal kuliah (n): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputData(jadwal);
        
        int pilihan;
        do {
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Berdasarkan Hari");
            System.out.println("3. Cari Berdasarkan Nama MK");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1: tampilkanTabel(jadwal); break;
                case 2: cariBerdasarkanHari(jadwal); break;
                case 3: cariBerdasarkanMK(jadwal); break;
                case 4: System.out.println("Terima kasih!"); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }

    public static void inputData(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nMasukkan data jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            array[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            array[i][1] = sc.nextLine();
            System.out.print("Hari Kuliah      : ");
            array[i][2] = sc.nextLine();
            System.out.print("Jam Kuliah       : ");
            array[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanTabel(String[][] array) {
        System.out.println("\n-----------------------------------------------------------------------");
        System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", "Nama MK", "Ruang", "Hari", "Jam");
        System.out.println("-----------------------------------------------------------------------");
        for (String[] row : array) {
            System.out.printf("| %-20s | %-10s | %-10s | %-15s |\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("-----------------------------------------------------------------------");
    }

    public static void cariBerdasarkanHari(String[][] array) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;
        System.out.println("Jadwal pada hari " + cari + ":");
        for (int i = 0; i < array.length; i++) {
            if (array[i][2].equalsIgnoreCase(cari)) {
                System.out.printf("- %s (%s) Jam: %s\n", array[i][0], array[i][1], array[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("hari tidak ditemukan.");
    }

    public static void cariBerdasarkanMK(String[][] array) {
        System.out.print("\nMasukkan nama Mata Kuliah yang dicari: ");
        String cari = sc.nextLine();
        boolean ditemukan = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equalsIgnoreCase(cari)) {
                System.out.println("Informasi MK: Ruang " + array[i][1] + ", Hari " + array[i][2] + ", Jam " + array[i][3]);
                ditemukan = true;
            }
        }
        if (!ditemukan) System.out.println("Mata kuliah tidak ditemukan.");
    }
}