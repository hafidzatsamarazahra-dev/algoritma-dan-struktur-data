package jobsheet2;

public class mahasiswaMain11 {
    public static void main(String[] args) {
        
        mahasiswa11 mhs1 = new mahasiswa11();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
        mhs1.tampilkanInformasi();

        System.out.println("---------------------------");

        mahasiswa11 mhsHafidza = new mahasiswa11("Hafidza", "254107020034", 3.7, "TI-1G");
        
        mhsHafidza.tampilkanInformasi();
    }
}