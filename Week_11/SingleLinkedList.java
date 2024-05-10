package Week_11;

public class SingleLinkedList {
    Node head, tail;

    boolean isEmpty() { // kondisinya head harus null
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int data) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addFirst
        Node ndInput = new Node(data, null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
                         // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
            ndInput.next = null;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        // node baru yang ditambahkan berisi data melalui parameter
        // pada method addLast
        Node ndInput = new Node(input, null);
        if (isEmpty()) { // jika kosong, maka peran head dan tail
            // harus dimiliki node yang sama
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next != null) { // jika tidak ada node selanjutnya
                                            // maka jadikan ndInput sebagai tail
                    tail = ndInput;
                    break;
                }
            }
            temp = temp.next;
        } while (temp == null);
    }

    void insertAt(int index, int input) {
        // pastikan operasi dari method ini adalah menggeser posisi
        // node yang terletak di index dan method tersebut berpindah
        // satu index setelahnya
        Node ndInput = new Node(input, null);
        if (index < 0) {
            System.out.println("Index tidak valid");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
