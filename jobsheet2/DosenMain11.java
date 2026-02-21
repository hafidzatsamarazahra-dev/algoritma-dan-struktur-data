package jobsheet2;

public class DosenMain11 {
    public static void main(String[] args) {

        Dosen11 d1 = new Dosen11();
        d1.idDosen = "D01";
        d1.nama = "Dr. Budi Santoso";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Sistem Informasi";

        System.out.println("=== DATA DOSEN 1 ===");
        d1.tampilInformasi();
        d1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Data Science");
        d1.tampilInformasi();

        System.out.println("\n=== DATA DOSEN 2 ===");

        Dosen11 d2 = new Dosen11("D02", "Siti Aminah, M.Kom", true, 2020, "Mobile Programming");
        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
    }
}