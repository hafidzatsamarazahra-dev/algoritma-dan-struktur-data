package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class mainFaktorial11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = input.nextInt();

        faktorial11 fk = new faktorial11();
        System.out.println("nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("nilai faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
    }
}
