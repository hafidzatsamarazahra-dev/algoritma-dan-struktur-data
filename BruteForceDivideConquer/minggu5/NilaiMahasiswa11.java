package BruteForceDivideConquer.minggu5;

public class NilaiMahasiswa11 {
    mahasiswa11[] mhs;

    NilaiMahasiswa11(mahasiswa11[] mhs) {
        this.mhs = mhs;
    }

    mahasiswa11 cariMaxDC(int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;
        mahasiswa11 lMax = cariMaxDC(l, mid);
        mahasiswa11 rMax = cariMaxDC(mid + 1, r);

        return (lMax.nilaiUTS > rMax.nilaiUTS) ? lMax : rMax;
    }

    mahasiswa11 cariMinDC(int l, int r) {
        if (l == r) {
            return mhs[l];
        }
        int mid = (l + r) / 2;
        mahasiswa11 lMin = cariMinDC(l, mid);
        mahasiswa11 rMin = cariMinDC(mid + 1, r);

        return (lMin.nilaiUTS < rMin.nilaiUTS) ? lMin : rMin;
    }

    double rataUASBF() {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS;
        }
        return total / mhs.length;
    }
}