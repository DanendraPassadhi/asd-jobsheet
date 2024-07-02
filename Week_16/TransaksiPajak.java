public class TransaksiPajak {
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan Kendaraan;
    Node head;
    Node next;

    TransaksiPajak() {

    }

    TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan Kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.Kendaraan = Kendaraan;
    }

    long hitungNominalBayar(Kendaraan k) {
        long biaya = 0;
        switch (k.jenis) {
            case "Motor":
                if (k.cc < 100) {
                    biaya = 100000;
                } else if (k.cc <= 250) {
                    biaya = 250000;
                } else {
                    biaya = 500000;
                }
                break;
            case "Mobil":
                if (k.cc < 1000) {
                    biaya = 750000;
                } else if (k.cc <= 2500) {
                    biaya = 1000000;
                } else {
                    biaya = 1500000;
                }
                break;
            default:
                biaya = 0;
                break;
        }
        return biaya;
    }

    long hitungDenda(Kendaraan k, int bulanBayar) {
        int selisihBulan = bulanBayar - k.bulanHarusBayar;
        long denda = 0;
        if (selisihBulan > 0) {
            if (selisihBulan <= 3) {
                denda = 50000;
            } else {
                denda = selisihBulan * 50000;
            }
        }
        return denda;
    }

    // int hitungTotalPendapatan() {
    //     int totalPendapatan = 0;
    //     Node current = head;
    //     while (current != null) {
    //         totalPendapatan += current.nominalBayar + current.denda;
    //         current = current.next;
    //     }
    //     return totalPendapatan;
    // }

    void sortAscending() {
        boolean swap;
        do {
            swap = false;
            Node current = head;
            while (current.next != null) {
                if (current.data.noTNKB.compareTo(current.next.data.noTNKB) > 0) {
                    Kendaraan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
        } while (swap);
    }
    
    int hitungTotalPendapatan() {
        int totalPendapatan = 0;
        Node current = head;
        while (current != null) {
            totalPendapatan += nominalBayar + denda;
            current = current.next;
        }
        return totalPendapatan;
    }

    void cetakDaftar() {
        System.out.printf("|%-15s|%-15s|%-12s|%-12s|%-6s|%-18s|\n", "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
        Node current = head;
        while (current != null) {
            System.out.printf("|%-15s|%-15s|%-12s|%-12s|%-6s|%-18s|\n", current.data.noTNKB, current.data.nama, current.data.jenis, current.data.cc, current.data.tahun, current.data.bulanHarusBayar);
            current = current.next;
        }
    }
}
