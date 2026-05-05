package pertemuan11;

public class mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

public mahasiswa11() {
   }

public mahasiswa11(String nm, String name, String kls, double ip) {
    nim = nm;
    nama = name;
    kelas = kls;
    ipk = ip;
}

public void tampilInformasi() {
    System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
}

}
