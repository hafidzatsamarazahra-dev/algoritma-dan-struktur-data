package kuis2;
public class nodePesanan11 {
    pesanan11 data;
    nodePesanan11 prev;
    nodePesanan11 next;

    public nodePesanan11(pesanan11 data) {
        this.data = data;
        prev = null;
        next = null;
    }
}