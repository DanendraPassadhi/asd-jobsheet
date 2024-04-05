package _1Searching;
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

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks : " + pos);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public Buku06 FindBuku(String cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                return listBk[i];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) < 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void Sort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[j + 1].judulBuku) > 0) {
                    Buku06 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    public int SequentialSearchByTitle(String cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }
    
    public int BinarySearchByTitle(String cari, int left, int right) {
        Sort();
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (listBk[mid].judulBuku.equalsIgnoreCase(cari)) {
                return mid;
            }

            if (listBk[mid].judulBuku.compareTo(cari) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public int hitungJudul(String judul) {
        int hitung = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(judul)) {
                hitung++;
            }
        }
        return hitung;
    }
}
