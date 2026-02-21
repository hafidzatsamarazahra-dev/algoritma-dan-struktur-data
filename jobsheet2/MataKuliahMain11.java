package jobsheet2;

public class MataKuliahMain11 {
    public static void main(String[] args) {
        
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "ALSD_TI";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        System.out.println("=== Data Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        System.out.println("\n---------------------------\n");

        MataKuliah11 mk2 = new MataKuliah11("BING_TI", "Bahasa Inggris Teknik", 2, 4);

        System.out.println("=== Data Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        mk2.kurangiJam(10);
        mk2.tampilInformasi();
    }
}