package tugasJobsheet10;

public class antrianKRS11 {
        mahasiswa11[] data;
        int front; 
        int rear; 
        int size;
        int max;
        int totalDiproses = 0;
        int kuotaDPA = 30;

        public antrianKRS11(int n) {
            max = n;
            data = new mahasiswa11[max];
            clear();
        }

        public boolean isEmpty() { 
            return size == 0; 
        }

        public boolean isFull() { 
            return size == max; 
        }

        public void clear() {
            front = 0;
            rear = -1;
            size = 0;
        }

        public void tambahAntrian(mahasiswa11 mhs) {
            if (!isFull()) {
                rear = (rear + 1) % max;
                data[rear] = mhs;
                size++;
            } else {
                System.out.println("Antrian penuh!");
            }
        }

        public void prosesKRS() {
            if (size < 2) {
                System.out.println("Minimal harus ada 2 mahasiswa untuk diproses!");
            } else {
                System.out.println("Memproses KRS untuk 2 mahasiswa:");
                for (int i = 0; i < 2; i++) {
                    System.out.print("Diproses: ");
                    data[front].tampilkanData();
                    front = (front + 1) % max;
                    size--;
                    totalDiproses++;
                }
            }
        }

        public void tampilkanSemua() {
            if (isEmpty()) {
                System.out.println("Antrian kosong.");
            } else {
                int i = front;
                int tempSize = size;
                while (tempSize > 0) {
                    data[i].tampilkanData();
                    i = (i + 1) % max;
                    tempSize--;
                }
            }
        }

        public void lihat2Terdepan() {
            if (size >= 2) {
                System.out.println("2 Antrian Terdepan:");
                data[front].tampilkanData();
                data[(front + 1) % max].tampilkanData();
            } else {
                System.out.println("Mahasiswa kurang dari 2.");
            }
        }

        public void lihatAkhir() {
            if (!isEmpty()) {
                System.out.print("Antrian Paling Akhir: ");
                data[rear].tampilkanData();
            }
        }

        public void cetakStats() {
            System.out.println("Jumlah Antrian Saat Ini: " + size);
            System.out.println("Total Sudah Proses KRS: " + totalDiproses);
            System.out.println("jumlah mahasiswa yang belum proses krs: " + (kuotaDPA - totalDiproses));
        }
}

