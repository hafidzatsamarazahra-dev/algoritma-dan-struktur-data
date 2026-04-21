package studiKasus1;

public class dataPeminjaman11 {
    peminjaman11[] dataPeminjaman = new peminjaman11[10];
    int idx;

    void tambah(peminjaman11 p){
        dataPeminjaman[idx] = p;
        idx++;
    }

    void tampil(){
        for(int i = 0; i < idx; i++){
            dataPeminjaman[i].tampilPeminjaman();
        }
    }

    void sortingASC(){
        for(int i = 0; i < idx-1; i++){
            int min = i;
            for(int j = i+1; j < idx; j++){
                if(dataPeminjaman[j].mhs.nim.compareTo(dataPeminjaman[min].mhs.nim) < 0){
                    min = j;
                }
            }
            peminjaman11 tmp = dataPeminjaman[min];
            dataPeminjaman[min] = dataPeminjaman[i];
            dataPeminjaman[i] = tmp;
        }
    }

    int cariNIM(String nim){
    for(int i = 0; i < idx; i++){
        if(dataPeminjaman[i].mhs.nim.equals(nim)){
            return i;
        }
    }
    return -1;
    }
    void tampilNIM(String nim){
    boolean ketemu = false;

    for(int i = 0; i < idx; i++){
        if(dataPeminjaman[i].mhs.nim.equals(nim)){
            dataPeminjaman[i].tampilPeminjaman();
            ketemu = true;
        }
    }

    if(!ketemu){
        System.out.println("Data dengan NIM " + nim + " tidak ditemukan");
    }
    }
}