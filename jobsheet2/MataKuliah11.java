package jobsheet2;

public class MataKuliah11 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah11() {
    }

    public MataKuliah11(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("Nama MK    : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jam ditambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jam <= jumlahJam) {
            this.jumlahJam -= jam;
            System.out.println("Jam dikurangi. Sisa jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan! Jumlah jam tidak mencukupi.");
        }
    }
}