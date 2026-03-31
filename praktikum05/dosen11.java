package praktikum05;

public class dosen11 {
    String kode;
    String nama;
    String jenisKelamin;
    int usia;

    dosen11(String kd, String nm, String jk, int age){
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin );
        System.out.println("Usia: " + usia);
        System.out.println("----------------------");
    }
}