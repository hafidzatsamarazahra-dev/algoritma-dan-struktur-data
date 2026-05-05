package pertemuan11;

public class mahasiswaTugas11 {
    String nim;
    String nama;
    String kelas;
    double ipk;

public mahasiswaTugas11() {
   }

public mahasiswaTugas11(String nm, String name, String kls, double ip) {
    nim = nm;
    nama = name;
    kelas = kls;
    ipk = ip;
}

public void tampilInformasi() {
    System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
}

}
