package praktikum14;
import java.util.Stack;
public class stackDemo11 {
    public static void main(String[] args) {
        book11 book1 = new book11("1234", "Dasar Pemrograman");
        book11 book2 = new book11("7145", "Hafalah Shalat Delisa");
        book11 book3 = new book11("3562", "Muhammad Al-Fatih");

        Stack<book11> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book11 temp = books.peek();

        if (temp != null){
            System.out.println(temp.toString());
        }

        book11 temp2 = books.pop();

        if (temp2 != null){
            System.out.println(temp2.toString());
        }

        for (book11 book : books){
            System.out.println(book.toString());
        }
        int posisi = books.search(book2);
        System.out.println("Buku ini berada di posisi " + posisi);
    }
}
