public class Pesanan06 {
    int kodePesanan06;
    String namaPesanan06;
    int harga06;
    NodePesanan06 head06;
    NodePesanan06 tail06;

    Pesanan06() {

    }

    Pesanan06(int a, String b, int c) {
        kodePesanan06 = a;
        namaPesanan06 = b;
        harga06 = c;
    }

    boolean isEmpty() {
        return head06 == null;
    }
    
    void tambah(Pesanan06 data) {
        NodePesanan06 input06 = new NodePesanan06(data, tail06, null);
        if (isEmpty()) {
            head06 = input06;
            tail06 = input06;
        } else {
            tail06.next06 = input06;
            input06.prev06 = tail06;
            tail06 = input06;
        }
    }

    void cetakPesanan() {
        System.out.printf("|%-3s|%-15s|%-10s|\n", "No.", "Nama Pesanan", "Harga");
        NodePesanan06 current06 = head06;
        while (current06 != null) {
            System.out.printf("|%-3s|%-15s|%-10s|\n", current06.data06.kodePesanan06, current06.data06.namaPesanan06, current06.data06.harga06);
            current06 = current06.next06;
        }
    }

    void sortAscending() {
        boolean swap06;
        do {
            swap06 = false;
            NodePesanan06 current06 = head06;
            while (current06.next06 != null) {
                if (current06.data06.namaPesanan06.compareTo(current06.next06.data06.namaPesanan06) > 0) {
                    Pesanan06 temp06 = current06.data06;
                    current06.data06 = current06.next06.data06;
                    current06.next06.data06 = temp06;
                    swap06 = true;
                }
                current06 = current06.next06;
            }
        } while (swap06);
    }

    int hitungTotalPendapatan() {
        int totalPendapatan06 = 0;
        NodePesanan06 current06 = head06;
        while (current06 != null) {
            totalPendapatan06 += current06.data06.harga06;
            current06 = current06.next06;
        }
        return totalPendapatan06;
    }
}
