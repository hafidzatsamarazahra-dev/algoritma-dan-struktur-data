package pertemuan14;
public class mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa11(){
    }

    public mahasiswa11(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println("NIM: "+this.nim+" "+
        "Nama: "+this.nama+" "+
        "Kelas: "+this.kelas+" "+
        "Ipk: "+this.ipk);
    }
}
