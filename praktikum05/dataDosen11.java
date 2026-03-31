package praktikum05;

public class dataDosen11 {
    dosen11[] dataDosen = new dosen11[10];
    int idx;

    void tambah(dosen11 dsn){
        if(idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil(){
        for(int i = 0; i < idx; i++){
            dataDosen[i].tampil();
        }
    }

    void SortingASC(){
        for(int i = 0; i < idx-1; i++){
            for(int j = 1; j < idx-i; j++){
                if(dataDosen[j].usia < dataDosen[j-1].usia){
                    dosen11 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for(int i = 0; i < idx-1; i++){
            int max = i;
            for(int j = i+1; j < idx; j++){
                if(dataDosen[j].usia > dataDosen[max].usia){
                    max = j;
                }
            }
            dosen11 tmp = dataDosen[max];
            dataDosen[max] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
     void insertionSort(){
        for(int i = 1; i < idx; i++){
            dosen11 temp = dataDosen[i];
            int j = i;
            while(j > 0 && dataDosen[j-1].usia > temp.usia){
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}