package studiKasus1;

public class peminjaman11 {
    mahasiswa11 mhs;
    buku11 buku;
    int lamaPinjam;
    int batasPinjam=5;
    int terlambat;
    int denda;
    
    peminjaman11(mahasiswa11 mhs,buku11 buku,int lmPinjam){
        this.mhs=mhs;
        this.buku=buku;
        this.lamaPinjam=lmPinjam;
    }

    void hitungDenda(){
        if(lamaPinjam>batasPinjam){
            terlambat=lamaPinjam-batasPinjam;
            denda=terlambat*2000;
        }else{
            denda=0;
        }
    }

    void tampilPeminjaman(){
    hitungDenda();
    System.out.println(
        mhs.nama + " | " +
        buku.judul + " | " +
        "lama:" + lamaPinjam + " | " +
        "terlambat:" + terlambat + " | " +
        "denda:" + denda
    );
}
}
