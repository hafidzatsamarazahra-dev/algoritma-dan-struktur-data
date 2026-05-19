package kuis2;
import java.util.Scanner;
public class mainRoyalDelish11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        dllPembeli11 antrean = new dllPembeli11();
        dllPesanan11 pesanan = new dllPesanan11();

        int nomor = 1;
        int pilih;

        do {

            System.out.println("\n===== ROYAL DELISH =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Input Pesanan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    System.out.print(
                        "Apakah pembeli sudah pernah memesan sebelumnya? (ya/tidak): "
                    );
                    String jawab = sc.nextLine();

                    if(jawab.equalsIgnoreCase("ya")) {
                        pembeli11 prioritas = new pembeli11(nomor, nama, hp);
                        if (prioritas != null) {
                            antrean.addAfter(1, prioritas);
                            System.out.println(
                                "Pembeli " + nama + " diprioritaskan di nomor 2"
                            );
                        } nomor++;
                        break;
                    }else{
                        pembeli11 p =
                        new pembeli11(nomor, nama, hp);

                    antrean.addLast(p);

                    System.out.println(
                        "Antrian berhasil ditambahkan dengan nomor "
                        + nomor);
                        nomor++;
                    };

                    break;

                case 2:

                    antrean.print();

                    break;

                case 3:

                    pembeli11 keluar =
                        antrean.removeFirst();

                    if (keluar == null) {
                        System.out.println("Antrian kosong");
                    } else {

                        System.out.println(
                            keluar.namaPembeli +
                            " dipanggil"
                        );

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        pesanan11 ps =
                            new pesanan11(
                                kode,
                                namaPesanan,
                                harga
                            );

                        pesanan.addLast(ps);

                        System.out.println(
                            "Pesanan berhasil ditambahkan"
                        );
                    }

                    break;

                case 4:

                    pesanan.print();

                    break;

                case 5:

                    System.out.println(
                        "Total Pendapatan : "
                        + pesanan.totalPendapatan()
                    );

                    break;

                case 0:

                    System.out.println("Program selesai");

                    break;

                default:

                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);
    }
}