public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;
    Node head;
    int size;

    Kendaraan() {
        head = null;
        size = 0;
    }

    Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    boolean isEmpty() {
        return head == null;
    }

    void tambahAntrian(Kendaraan kendaraan) {
        if (isEmpty()) {
            head = new Node(null, kendaraan, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, kendaraan, null);
            current.next = newNode;
        }
        size++;
    }

    void cetakDaftar() {
        System.out.printf("|%-15s|%-15s|%-12s|%-12s|%-6s|%-18s|\n", "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
        Node current = head;
        while (current != null) {
            System.out.printf("|%-15s|%-15s|%-12s|%-12s|%-6s|%-18s|\n", current.data.noTNKB, current.data.nama, current.data.jenis, current.data.cc, current.data.tahun, current.data.bulanHarusBayar);
            current = current.next;
        }
    }

    Kendaraan cariKendaraan(String noTNKB) {
        Node current = head;
        while (current != null) {
            if (current.data.noTNKB.equalsIgnoreCase(noTNKB)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public String getTNKB() {
        return noTNKB;
    }

    public String getNamaPemilik() {
        return nama;
    }
}