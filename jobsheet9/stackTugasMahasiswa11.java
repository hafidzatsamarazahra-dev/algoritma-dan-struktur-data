package jobsheet9;

public class stackTugasMahasiswa11 {
    mahasiswa11[] stack;
    int top;
    int size;

    public stackTugasMahasiswa11(int size){
        this.size = size;
        stack = new mahasiswa11[size];
        top = -1;
    }
    public boolean isFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public void push(mahasiswa11 mhs){
        if (!isFull()){
            top++;
            stack[top] = mhs;
        }else{
            System.out.println("stack penuh! tidak bisa menambahkan tugas lagi.");
        }
    }
    public mahasiswa11 pop(){
        if (!isEmpty()){
            mahasiswa11 m = stack[top];
            top--;
            return m;
        }else{
            System.out.println("stack kosong! tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public mahasiswa11 peek(){
        if (!isEmpty()){
            return stack[top];
        }else{
            System.out.println("stack kosong! tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
