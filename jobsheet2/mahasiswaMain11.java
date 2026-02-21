package jobsheet2;

public class mahasiswaMain11 {
    public static void main(String[] args) {

        mahasiswa11 mhs1 = new mahasiswa11();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        System.out.println("---------------------------");

        mahasiswa11 mhs2 = new mahasiswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}