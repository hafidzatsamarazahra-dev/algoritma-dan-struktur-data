package praktikum05;

public class mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    
    // konstruktor default
    mahasiswa11(){

    }

    // kostruktor berparamete (dibuat ada yang nama var parameter inputnya sama ada yang tidak)
    mahasiswa11(String nm,String name, String kls,double ip){
        nim=nm;
        nama=name;
        ipk=ip;
        kelas=kls;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Kelas "+kelas);
        System.out.println("IPK "+ipk);
    }
}
