package jobsheet3;

public class dataDosen11 {
    public void dataSemuaDosen(dosen11[] arrayOfDosen) {
        for (dosen11 d : arrayOfDosen) {
            d.tampilData();
        }
    }
    public void jumlahDosenPerJenisKelamin(dosen11[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    public void rerataUsiaDosenPerJenisKelamin(dosen11[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalPria += d.usia;
                countPria++;
            } else if (d.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalWanita += d.usia;
                countWanita++;
            }
        }

        if (countPria > 0)
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / countPria));

        if (countWanita > 0)
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / countWanita));
    }
    public void infoDosenPalingTua(dosen11[] arrayOfDosen) {
        dosen11 tertua = arrayOfDosen[0];

        for (dosen11 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("\nDosen Paling Tua:");
        tertua.tampilData();
    }
    public void infoDosenPalingMuda(dosen11[] arrayOfDosen) {
        dosen11 termuda = arrayOfDosen[0];

        for (dosen11 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("\nDosen Paling Muda:");
        termuda.tampilData();
    }
}