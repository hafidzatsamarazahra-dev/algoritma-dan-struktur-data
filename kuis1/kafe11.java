package kuis1;

public class kafe11 {
    String nama;
    int harga;

    public void tambahData(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    void tampilkanInfo(){
        System.out.println("Nama pemesan: " + nama);
        System.out.println("Harga pesanan: " + harga);
    }
}