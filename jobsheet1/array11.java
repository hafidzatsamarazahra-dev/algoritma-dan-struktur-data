package jobsheet1;
import java.util.Scanner;

public class array11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println(" Program Menghitung IP Semester");
        System.out.println("===============================");

        System.out.print("Masukkan nilai angka untuk MK Pancasila: ");
        double pancasila = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Konsep Teknologi Informasi: ");
        double kti = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Critical Thinking dan Problem Solving: ");
        double ctps = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Matematika Dasar: ");
        double mtk = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Bahasa Inggris: ");
        double ing = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Dasar Pemrograman: ");
        double daspro = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Praktikum Dasar Pemrograman: ");
        double prakdaspro = sc.nextDouble();
        System.out.print("Masukkan nilai angka untuk MK Keselamatan dan Kesehatan Kerja: ");
        double k3 = sc.nextDouble();

        int sksP = 2, sksKTI = 2, sksCTPS = 2, sksMTK = 2;
        int sksING = 2, sksDP = 2, sksPDP = 3, sksK3 = 2;

        double bP = konversiBobot(pancasila);
        double bKTI = konversiBobot(kti);
        double bCTPS = konversiBobot(ctps);
        double bMTK = konversiBobot(mtk);
        double bING = konversiBobot(ing);
        double bDP = konversiBobot(daspro);
        double bPDP = konversiBobot(prakdaspro);
        double bK3 = konversiBobot(k3);

        String hP = konversiHuruf(pancasila);
        String hKTI = konversiHuruf(kti);
        String hCTPS = konversiHuruf(ctps);
        String hMTK = konversiHuruf(mtk);
        String hING = konversiHuruf(ing);
        String hDP = konversiHuruf(daspro);
        String hPDP = konversiHuruf(prakdaspro);
        String hK3 = konversiHuruf(k3);

        System.out.println("\n============================");
        System.out.println(" Hasil Konversi Nilai");
        System.out.println("============================");
        System.out.printf("%-35s %-12s %-12s %-12s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Pancasila", pancasila, hP, bP);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Konsep Teknologi Informasi", kti, hKTI, bKTI);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Critical Thinking dan Problem Solving", ctps, hCTPS, bCTPS);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Matematika Dasar", mtk, hMTK, bMTK);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Bahasa Inggris", ing, hING, bING);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Dasar Pemrograman", daspro, hDP, bDP);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Praktikum Dasar Pemrograman", prakdaspro, hPDP, bPDP);
        System.out.printf("%-35s %-12.2f %-12s %-12.2f\n",
                "Keselamatan dan Kesehatan Kerja", k3, hK3, bK3);
        double totalBobot =
                bP * sksP + bKTI * sksKTI + bCTPS * sksCTPS + bMTK * sksMTK +
                bING * sksING + bDP * sksDP + bPDP * sksPDP + bK3 * sksK3;

        int totalSKS = sksP + sksKTI + sksCTPS + sksMTK +
                       sksING + sksDP + sksPDP + sksK3;

        double ip = totalBobot / totalSKS;

        System.out.println("============================");
        System.out.printf("IP : %.2f\n", ip);
        System.out.println("============================");

        sc.close();
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
