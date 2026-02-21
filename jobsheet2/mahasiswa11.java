package jobsheet2;

public class mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public mahasiswa11() {
    }

    public mahasiswa11(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim; 
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid.");
        }
    }
}