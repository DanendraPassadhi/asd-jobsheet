public class Pembeli06 {
    int noAntrian06;
    String namaPembeli06;
    String noHp06;

    Pembeli06(int a, String b, String c) {
        noAntrian06 = a;
        namaPembeli06 = b;
        noHp06 = c;
    }
}

class Menu06 {
    Node06 head06;
    int size06;

    Menu06() {
        head06 = null;
        size06 = 0;
    }

    boolean isEmpty() {
        return head06 == null;
    }

    void tambahAntrian(Pembeli06 pembeli06) {
        if (isEmpty()) {
            head06 = new Node06(null, pembeli06, null);
        } else {
            Node06 current06 = head06;
            while (current06.next06 != null) {
                current06 = current06.next06;
            }
            Node06 newNode06 = new Node06(current06, pembeli06, null);
            current06.next06 = newNode06;
        }
        size06++;
    }

    void cetakAntrian() {
        System.out.printf("|%-3s|%-15s|%-12s|\n", "No.", "Nama Customer", "No hp");
        Node06 current06 = head06;
        while (current06 != null) {
            System.out.printf("|%-3s|%-15s|%-12s|\n", current06.data06.noAntrian06, current06.data06.namaPembeli06, current06.data06.noHp06);
            current06 = current06.next06;
        }
        System.out.println("Total Antrian: " + (size06));
    }

    public String getFirst() {
        return head06.data06.namaPembeli06;
    }

    Pembeli06 hapusAntrian() {
        if (isEmpty()) {
            return null;
        } else {
            Pembeli06 hapus06 = head06.data06;
            if (head06.next06 == null) {
                head06 = null;
            } else {
                head06 = head06.next06;
                head06.prev06 = null;
            }
            size06--;
            return hapus06;
        }
    }
}