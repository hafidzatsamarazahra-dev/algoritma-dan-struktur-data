package pertemuan11;
import java.util.Scanner;
public class SLLMain11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList11 sll = new singleLinkedList11();
         System.out.print("Masukkan jumlah data: ");
    int jumlah = sc.nextInt();
    sc.nextLine();

    for (int i = 0; i < jumlah; i++) {
        System.out.println("Data mahasiswa ke-" + (i+1));

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Kelas: ");
        String kelas = sc.nextLine();

        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
          sc.nextLine();

        mahasiswa11 mhs = new mahasiswa11(nim, nama, kelas, ipk);

        sll.addLast(mhs);
    }

        System.out.println("\nData Linked List:");
        sll.print();
    }
        // mahasiswa11 mhs1 = new mahasiswa11("24212200","Alvaro","1A",4.0);
        // mahasiswa11 mhs2 = new mahasiswa11("23212201","Bimon","2B",3.8);
        // mahasiswa11 mhs3 = new mahasiswa11("22212202","Cintia","3C",3.5);
        // mahasiswa11 mhs4 = new mahasiswa11("21212203","Dirga","4D",3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga",mhs3);
        // sll.insertAt(2,mhs2);
        // sll.print();
    }
