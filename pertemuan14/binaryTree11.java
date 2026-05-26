package pertemuan14;
public class binaryTree11 {
    node11 root;

    public binaryTree11(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }

    public void add(mahasiswa11 mahasiswa){
        node11 newNode = new node11(mahasiswa);
        if (isEmpty()){
            root = newNode;
        }else{
            node11 current = root;
            node11 parent = null;
            while(true){
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk){
        boolean result = false;
        node11 current = root;
        while (current != null){
            if(current.mahasiswa.ipk == ipk){
                result = true;
                break;
            }else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            }else{
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(node11 node){
        if(node != null){
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);

        }
    }

    void traverseInOrder(node11 node){
        if(node != null){
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(node11 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    node11 getSuccessor(node11 del){
        node11 successor = del.right;
        node11 successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if(isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        }
        node11 parent = root;
        node11 current = root;
        boolean isLeftChild = false;
        while (current != null){
            if(current.mahasiswa.ipk == ipk){
                break;
            }else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null){
            System.out.println("data tidak ditemukan");
            return;
        }else{
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.left == null){
                if(current == root){
                    root = current.right;
                }else{
                    if(isLeftChild){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                if(current == root){
                    root = current.left;
                }else{
                    if(isLeftChild){
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                node11 successor = getSuccessor(current);
                System.out.println("jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if(current == root){
                    root = successor;
                }else{
                    if(isLeftChild){
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
