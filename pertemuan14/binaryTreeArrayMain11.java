package pertemuan14;

public class binaryTreeArrayMain11 {
    public static void main(String[] args) {

        binaryTree11 bst = new binaryTree11();

        bst.add(new mahasiswa11("220101001", "Andi", "TI-1A", 3.95));
        bst.add(new mahasiswa11("220101002", "Budi", "TI-1A", 3.20));
        bst.add(new mahasiswa11("220101003", "Sinta", "TI-1B", 3.82));
        bst.add(new mahasiswa11("220101004", "Rina", "TI-1B", 3.45));
        bst.add(new mahasiswa11("220101005", "Dimas", "TI-1C", 2.75));
        bst.add(new mahasiswa11("220101006", "Fajar", "TI-1C", 3.10));
        bst.add(new mahasiswa11("220101007", "Nabila", "TI-1D", 3.76));
        bst.add(new mahasiswa11("220101008", "Rizky", "TI-1D", 3.50));
        bst.add(new mahasiswa11("220101009", "Aulia", "TI-1E", 3.88));
        bst.add(new mahasiswa11("220101010", "Kevin", "TI-1E", 3.00));


        System.out.println("=== Daftar Mahasiswa ===");
        bst.traverseInOrder(bst.root);


        System.out.println("\n=== Cari Mahasiswa Berdasarkan Nama ===");
        bst.cariNama("sinta");


        System.out.println("\n=== 3 IPK Tertinggi ===");
        bst.tigaIPKTertinggi();


        System.out.println("\n=== Mahasiswa Kelas TI-1D ===");
        bst.tampilKelas("TI-1D");

    }
}