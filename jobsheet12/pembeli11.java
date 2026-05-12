package jobsheet12;

public class pembeli11 {
    int noAntrian;
    String namaPembeli;
    String noHp;

    public pembeli11(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
        System.out.println(noAntrian + "\t" + namaPembeli + "\t" + noHp);
    }
}