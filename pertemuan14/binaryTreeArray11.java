package pertemuan14;

public class binaryTreeArray11 {
    mahasiswa11[] dataMahasiswa;
    int idxLast;

    public binaryTreeArray11(){
        this.dataMahasiswa = new mahasiswa11[10];
    }

    void populateData(mahasiswa11 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
    void add(mahasiswa11 data) {
        if (idxLast == dataMahasiswa.length - 1) {
            System.out.println("Array sudah penuh");
            return;
        }

        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
