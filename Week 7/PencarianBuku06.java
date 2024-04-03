public class PencarianBuku06 {
    Buku06 listBk[] = new Buku06[5];
    int idx;

    void tambah(Buku06 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku06 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 2;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                j = posisi;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks : " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
}