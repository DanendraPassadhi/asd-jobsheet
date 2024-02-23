public class Buku06 {
    String judul, pengarang;
    int halaman, stok, harga, terjual, totalDiskon, hargaTotal, hargaBayar;

    public Buku06() {

    }

    public Buku06(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Stok : " + stok);
        System.out.println("Harga : Rp " + harga);

        System.out.printf("\nHarga Total : %d \nTotal Diskon : %d \nHarga Bayar : %d ", hargaTotal, totalDiskon, hargaBayar);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * terjual;
    }

    int hitungDiskon() {
        if (hargaTotal > 150000) {
            totalDiskon = (int) (harga * 0.12);
        } else if (hargaTotal >= 75000 || harga <= 150000) {
            totalDiskon = (int) (harga * 0.05);
        } else {
            totalDiskon = 0;
        }
        return totalDiskon;
    }

    int hitungHargaBayar() {
        return hargaTotal - totalDiskon;
    }
}