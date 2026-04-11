package studiKasus1;

public class buku11 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    
    buku11(String kode,String jdl,int thn){
        kodeBuku=kode;
        judul=jdl;
        tahunTerbit=thn;
    }

    void tampilBuku(){
        System.out.print("kode buku: " + kodeBuku + " | ");
        System.out.print("judul buku: " + judul + " | ");
        System.out.print("tahun terbit: " + tahunTerbit);
    }
}
