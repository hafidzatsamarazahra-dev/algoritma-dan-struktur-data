package praktikum14;

public class book11 {
    public String isbn;
    public String title;

    public book11(){

    }

    public book11(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + "Title: " + this.title;
    }
}
