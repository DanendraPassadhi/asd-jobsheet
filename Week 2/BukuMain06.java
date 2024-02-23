public class BukuMain06 {
    public static void main(String[] args) {
        Buku06 bk1 = new Buku06();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.terjual(5);
        bk1.gantiHarga(60000);

        bk1.hargaTotal = bk1.hitungHargaTotal();
        bk1.totalDiskon = bk1.hitungDiskon();
        bk1.hargaBayar = bk1.hitungHargaBayar();
        bk1.tampilInformasi();
        
        Buku06 bk2 = new Buku06("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.hargaTotal = bk2.hitungHargaTotal();
        bk2.totalDiskon = bk2.hitungDiskon();
        bk2.hargaBayar = bk2.hitungHargaBayar();
        bk2.tampilInformasi();
        
        Buku06 bukuDanendra = new Buku06("Tentang Kamu", "Tere Liye", 524, 5, 80000);
        bukuDanendra.terjual(1);
        bukuDanendra.hargaTotal = bukuDanendra.hitungHargaTotal();
        bukuDanendra.totalDiskon = bukuDanendra.hitungDiskon();
        bukuDanendra.hargaBayar = bukuDanendra.hitungHargaBayar();
        bukuDanendra.tampilInformasi();
    }
}