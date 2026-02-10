package jobsheet1;
import java.util.Scanner;

public class pemilihan11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 || uas < 0 || uas > 100) {

            System.out.println("===================");
            System.out.println("nilai tidak valid");
            System.out.println("===================");

        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);
            
            System.out.println("===================");
            System.out.println("nilai akhir: " + nilaiAkhir);

            String huruf;
            if (nilaiAkhir > 80) huruf = "A";
            else if (nilaiAkhir > 73) huruf = "B+";
            else if (nilaiAkhir > 65) huruf = "B";
            else if (nilaiAkhir > 60) huruf = "C+";
            else if (nilaiAkhir > 50) huruf = "C";
            else if (nilaiAkhir > 39) huruf = "D";
            else huruf = "E";

            System.out.println("Nilai Huruf: " + huruf);
            System.out.println("===================");

            if (huruf.equals("D") || huruf.equals("E"))
                System.out.println("ANDA TIDAK LULUS");
            else
                System.out.println("SELAMAT ANDA LULUS");
        }
    }
}