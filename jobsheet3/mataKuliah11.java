package jobsheet3;

public class mataKuliah11 {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah11() {

    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
}