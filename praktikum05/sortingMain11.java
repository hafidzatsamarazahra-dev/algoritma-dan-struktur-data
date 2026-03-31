package praktikum05;

public class sortingMain11 {
    public static void main(String[] args) {
        int a[]={ 20,10,2,7,12 };

        sorting11 dataurut1 = new sorting11(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("data sudah diurutkan dengan BUBBLESORT (ASC)");
        dataurut1.tampil();

        int b[]={30,20,2,8,14};

        sorting11 dataurut2 = new sorting11(b, b.length);

        System.out.println("data awal 2");
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        int c[]={40,10,4,9,3};

        sorting11 dataurut3 = new sorting11(c, c.length);

        System.out.println("data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
    
}
