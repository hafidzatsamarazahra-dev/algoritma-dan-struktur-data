package pertemuan11;

public class singleLinkedList11 {
    nodeMahasiswa11 head;
    nodeMahasiswa11 tail;

    boolean isEmpty(){
        return (head == null);
    }
    public void print(){
        if (!isEmpty()){
            nodeMahasiswa11 tmp = head;
            System.out.println("isi linked list:\t");
            while (tmp != null){
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("linked list kosong");
        }
    }
    public void addFirst(mahasiswa11 input){
        nodeMahasiswa11 ndInput = new nodeMahasiswa11(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(mahasiswa11 input){
        nodeMahasiswa11 ndInput = new nodeMahasiswa11(input,null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(String key,mahasiswa11 input){
        nodeMahasiswa11 ndInput = new nodeMahasiswa11(input,null);
        nodeMahasiswa11 temp =head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }
    public void insertAt(int index,mahasiswa11 input){
        if (index < 0){
            System.out.println("indeks salah");
        }else if (index == 0){
            addFirst(input);
        }else{
            nodeMahasiswa11 temp = head;
            for (int i=0;i<index-1;i++){
                temp =temp.next;
            }
            temp.next = new nodeMahasiswa11(input,temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            }
        }
    }

}
