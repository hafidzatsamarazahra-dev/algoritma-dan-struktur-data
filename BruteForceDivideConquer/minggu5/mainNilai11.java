package BruteForceDivideConquer.minggu5;

public class mainNilai11 {
    public static void main(String[] args) {
        mahasiswa11[] daftarMhs = {
            new mahasiswa11("Ahmad", "220101001", 2022, 78, 82),
            new mahasiswa11("Budi",  "220101002", 2022, 85, 88),
            new mahasiswa11("Cindy", "220101003", 2021, 90, 87),
            new mahasiswa11("Dian",  "220101004", 2021, 76, 79),
            new mahasiswa11("Eko",   "220101005", 2023, 92, 95),
            new mahasiswa11("Fajar", "220101006", 2020, 88, 85),
            new mahasiswa11("Gina",  "220101007", 2023, 80, 83),
            new mahasiswa11("Hadi",  "220101008", 2020, 82, 84)
        };

        NilaiMahasiswa11 proses = new NilaiMahasiswa11(daftarMhs);

        System.out.println("====================================================");
        System.out.println("            HASIL ANALISIS DATA MAHASISWA           ");
        System.out.println("====================================================");
        
        mahasiswa11 mMax = proses.cariMaxDC(0, daftarMhs.length - 1);
        System.out.println("a) Nilai UTS Tertinggi:");
        System.out.println("   Nama         : " + mMax.nama);
        System.out.println("   NIM          : " + mMax.nim);
        System.out.println("   Tahun Masuk  : " + mMax.tahunMasuk);
        System.out.println("   Nilai UTS    : " + mMax.nilaiUTS);
        System.out.println("----------------------------------------------------");

        mahasiswa11 mMin = proses.cariMinDC(0, daftarMhs.length - 1);
        System.out.println("b) Nilai UTS Terendah:");
        System.out.println("   Nama         : " + mMin.nama);
        System.out.println("   NIM          : " + mMin.nim);
        System.out.println("   Tahun Masuk  : " + mMin.tahunMasuk);
        System.out.println("   Nilai UTS    : " + mMin.nilaiUTS);
        System.out.println("----------------------------------------------------");

        double rata = proses.rataUASBF();
        System.out.printf("c) Rata-rata Nilai UAS Semua Mahasiswa: %.2f\n", rata);
        System.out.println("====================================================");
    }
}