package jobsheet12;

public class dllPembeli11 {

    nodePembeli11 head;
    nodePembeli11 tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(pembeli11 data) {

        nodePembeli11 newNode = new nodePembeli11(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public pembeli11 removeFirst() {

        if (isEmpty()) {
            return null;
        }

        pembeli11 data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return data;
    }

    public void addAfter(int key, pembeli11 data) {
        nodePembeli11 current = head;
        while(current != null){
            if(current.data.noAntrian == key){
                nodePembeli11 newNode =
                    new nodePembeli11(data);
                newNode.next = current.next;
                newNode.prev = current;
                if(current.next != null){
                    current.next.prev = newNode;
                }
                current.next = newNode;
                if(current == tail){
                    tail = newNode;
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Data tidak ditemukan");
    }
        
    public void print() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("No\tNama\tNo HP");

        nodePembeli11 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}