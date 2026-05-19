package kuis2;
public class dllPesanan11 {

    nodePesanan11 head;
    nodePesanan11 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(pesanan11 data) {

        nodePesanan11 newNode = new nodePesanan11(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {

        if (isEmpty()) {
            System.out.println("Pesanan kosong");
            return;
        }

        System.out.println("Kode\tNama Pesanan\tHarga");

        nodePesanan11 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public int totalPendapatan() {

        int total = 0;

        nodePesanan11 current = head;

        while (current != null) {
            total += current.data.harga;
            current = current.next;
        }

        return total;
    }
}
