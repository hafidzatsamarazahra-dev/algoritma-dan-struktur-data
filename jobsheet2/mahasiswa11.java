package jobsheet2;
public class mahasiswa11 {

    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        mahasiswa11 mhs = new mahasiswa11();

        mhs.nama = "Hafidza";
        mhs.nim = "254107020034";
        mhs.kelas = "TI-1G";
        mhs.updateIpk(3.7);

        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja(mhs.ipk));
    }
}