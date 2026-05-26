package pertemuan14;

public class binaryTreeArrayMain11 {
    public static void main(String[] args) {
    binaryTreeArray11 bta = new binaryTreeArray11();

    mahasiswa11 mhs1 = new mahasiswa11("244160121", "Ali", "A", 3.57);
    mahasiswa11 mhs2 = new mahasiswa11("244160185", "Candra", "C", 3.41);
    mahasiswa11 mhs3 = new mahasiswa11("244160221", "Badar", "B", 3.75);
    mahasiswa11 mhs4 = new mahasiswa11("244160220", "Dewi", "B", 3.35);

    mahasiswa11 mhs5 = new mahasiswa11("244160131", "Devi", "A", 3.48);
    mahasiswa11 mhs6 = new mahasiswa11("244160205", "Ehsan", "D", 3.61);
    mahasiswa11 mhs7 = new mahasiswa11("244160170", "Fizi", "B", 3.86);

    mahasiswa11[] dataMahasiswa = {mhs1,mhs2,mhs3,mhs4,mhs5,mhs6,mhs7,null, null, null};
    int idxLast = 6;
    bta.populateData(dataMahasiswa,idxLast);
    System.out.println("\nInOrder traversal mahasiswa: ");
    bta.traverseInOrder(0);

    System.out.println();
    System.out.println("PreOrder traversal mahasiswa:");
    bta.traversePreOrder(0);
    }
}
