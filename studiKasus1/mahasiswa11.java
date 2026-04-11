package studiKasus1;

public class mahasiswa11 {
    String nim;
    String nama;
    String prodi;
    
    mahasiswa11(String NIM,String nm,String prdi){
        nim=NIM;
        nama=nm;
        prodi=prdi;
    }

    void tampilMhs(){
        System.out.print("NIM: " + nim + " | ");
        System.out.print("Nama: " + nama + " | ");
        System.out.print("Prodi: " + prodi);
    }
}
