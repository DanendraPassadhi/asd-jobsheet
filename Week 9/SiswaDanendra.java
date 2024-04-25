public class SiswaDanendra {
    String nisnDanendra;
    String namaDanendra;
    String alamatDanendra;
    int tahunDanendra;
    double nilaiDanendra;

    SiswaDanendra(String nisn, String nm, String almt, int thn, double nilai) {
        nisnDanendra = nisn;
        namaDanendra = nm;
        alamatDanendra = almt;
        tahunDanendra = thn;
        nilaiDanendra = nilai;
    }

    void tampilData() {
        System.out.println("NISN\t\t: " + nisnDanendra);
        System.out.println("Nama\t\t: " + namaDanendra);
        System.out.println("Alamat\t\t: " + alamatDanendra);
        System.out.println("Tahun Masuk\t: " + tahunDanendra);
        System.out.println("Nilai Rata-Rata\t: " + nilaiDanendra);
    }
}

class adminSiswaDanendra {
    SiswaDanendra[] arrDanendra;

    adminSiswaDanendra(SiswaDanendra[] arrDanendra) {
        this.arrDanendra = arrDanendra;
    }

    int cariSiswa(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arrDanendra[mid].nisnDanendra.equals(cari)) {
                return mid;
            } else if (arrDanendra[mid].nisnDanendra.compareTo(cari) > 0) {
                return cariSiswa(cari, left, mid - 1);
            } else {
                return cariSiswa(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void sortingNISN() {
        for (int i = 0; i < arrDanendra.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < arrDanendra.length; j++) {
                if (arrDanendra[j].nisnDanendra.compareTo(arrDanendra[idxMin].nisnDanendra) < 0) {
                    idxMin = j;
                }
            }
            SiswaDanendra temp = arrDanendra[idxMin];
            arrDanendra[idxMin] = arrDanendra[i];
            arrDanendra[i] = temp;
        }
    }

    void pengurutanSiswa() {
        for (int i = 0; i < arrDanendra.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < arrDanendra.length; j++) {
                if (arrDanendra[j].nilaiDanendra > arrDanendra[idxMin].nilaiDanendra) {
                    idxMin = j;
                }
            }
            SiswaDanendra temp = arrDanendra[idxMin];
            arrDanendra[idxMin] = arrDanendra[i];
            arrDanendra[i] = temp;
        }
    }
}
