package jobsheet1;
import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println(" Program Menghitung IP Semester");
        System.out.println("===============================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("\nData Mata Kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = sc.nextLine();
            System.out.print("Bobot SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            nilaiHuruf[i] = konversiHuruf(nilaiAngka[i]);
            bobotNilai[i] = konversiBobot(nilaiAngka[i]);
        }

        System.out.println("\n============================");
        System.out.println(" Hasil Konversi Nilai");
        System.out.println("============================");
        System.out.printf("%-35s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobotXSkS = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-35s %-12.2f %-12s %-12.2f\n", 
                               namaMK[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            
            totalBobotXSkS += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }

        double ip = totalBobotXSkS / totalSKS;

        System.out.println("============================");
        System.out.printf("IP Semester : %.2f\n", ip);
        System.out.println("============================");
    }

    public static String konversiHuruf(double nilai) {
        if (nilai > 80) return "A";
        else if (nilai > 73) return "B+";
        else if (nilai > 65) return "B";
        else if (nilai > 60) return "C+";
        else if (nilai > 50) return "C";
        else if (nilai > 39) return "D";
        else return "E";
    }

    public static double konversiBobot(double nilai) {
        if (nilai > 80) return 4.0;
        else if (nilai > 73) return 3.5;
        else if (nilai > 65) return 3.0;
        else if (nilai > 60) return 2.5;
        else if (nilai > 50) return 2.0;
        else if (nilai > 39) return 1.0;
        else return 0.0;
    }
}