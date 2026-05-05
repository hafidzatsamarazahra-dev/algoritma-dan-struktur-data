package pertemuan11;

public class queueLinkedList11 {
        node11 front, rear;
        int size = 0;
        int max = 10;
    
        boolean isEmpty() {
            return front == null;
        }
    
        boolean isFull() {
            return size == max;
        }
    
        void clear() {
            front = rear = null;
            size = 0;
            System.out.println("Antrian dikosongkan");
        }
    
        void enqueue(mahasiswaTugas11 mhs) {
            if (isFull()) {
                System.out.println("Antrian penuh!");
                return;
            }
            node11 baru = new node11(mhs);
            if (isEmpty()) {
                front = rear = baru;
            } else {
                rear.next = baru;
                rear = baru;
            }
            size++;
            System.out.println("Mahasiswa masuk antrian");
        }
    
        void dequeue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong!");
            } else {
                System.out.print("Dipanggil: ");
                front.data.tampilInformasi();
                front = front.next;
                size--;
                if (front == null) rear = null;
            }
        }
    
        void peekFront() {
            if (!isEmpty()) {
                System.out.print("Antrian terdepan: ");
                front.data.tampilInformasi();
            }
        }
    
        void peekRear() {
            if (!isEmpty()) {
                System.out.print("Antrian terakhir: ");
                rear.data.tampilInformasi();
            }
        }
    
        void tampilSemua() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
            } else {
                node11 tmp = front;
                System.out.println("Isi antrian:");
                while (tmp != null) {
                    tmp.data.tampilInformasi();
                    tmp = tmp.next;
                }
            }
        }
    
        void jumlahAntrian() {
            System.out.println("Jumlah antrian: " + size);
        }
    }

