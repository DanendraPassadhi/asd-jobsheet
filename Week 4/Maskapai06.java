public class Maskapai06 {
    public String nomor06;
    public String tujuan06;
    public int tiket06;
    public int tersedia06;
    public int terdaftar06;

    public static Maskapai06[] Array06;

    public Maskapai06() {

    }

    public Maskapai06(String nomor06, String tujuan06, int tiket06, int tersedia06, int terdaftar06) {
        this.nomor06 = nomor06;
        this.tujuan06 = tujuan06;
        this.tiket06 = tiket06;
        this.tersedia06 = tersedia06;
        this.terdaftar06 = terdaftar06;
    }

    void tampil06() {
        System.out.println("Nomor Maskapai: " + nomor06);
        System.out.println("Tujuan: " + tujuan06);
        System.out.println("Total Biaya Tiket: " + hitungBiayaTiket06());
        System.out.println("Kursi Tersedia: " + tersedia06);
        System.out.println("Kursi Terdaftar: " + terdaftar06);
        System.out.println();
    }

    int hitungBiayaTiket06() {
        return terdaftar06 * tiket06;
    }

    void cariMaskapaiPenuh06(int cari06) {
        if (tersedia06 - terdaftar06 == cari06) {
            System.out.println("Nomor Maskapai: " + nomor06);
            System.out.println("Tujuan: " + tujuan06);
            System.out.println("Total Tiket: " + tiket06);
            System.out.println("Kursi Tersedia: " + tersedia06);
            System.out.println("Kursi Terdaftar: " + terdaftar06);
            System.out.println("Sisa Kursi: " + (tersedia06 - terdaftar06));
        }
    }

    void daftarMaskapai06() {
        int n = Array06.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Array06[j].tersedia06 > Array06[j + 1].tersedia06) {
                    Maskapai06 temp = Array06[j];
                    Array06[j] = Array06[j + 1];
                    Array06[j + 1] = temp;
                }
            }
        }
    }
}