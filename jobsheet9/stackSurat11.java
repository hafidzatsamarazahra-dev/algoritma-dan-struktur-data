package jobsheet9;

public class stackSurat11 {
    surat11[] stack;
    int top;
    int size;

    public stackSurat11(int size) {
        this.size = size;
        stack = new surat11[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat11 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh");
        }
    }

    public surat11 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].namaMahasiswa + " - " + stack[i].jenisIzin);
        }
    }

    public boolean search(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}