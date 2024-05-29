import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner Danendra = new Scanner(System.in);
        Menu06 antrian = new Menu06();
        Pesanan06 pesan = new Pesanan06();

        antrian.tambahAntrian(new Pembeli06(1, "Susi Susanti", "081234456"));
        antrian.tambahAntrian(new Pembeli06(2, "Kevin Sanjaya", "081234457"));
        antrian.tambahAntrian(new Pembeli06(3, "Fulan Fulana", "081234458"));
        antrian.tambahAntrian(new Pembeli06(4, "Marsha Lapian", "081234459"));

        String separator06 = "==================================================";
        String sep06 = "+++++++++++++++++++++++++";

        System.out.println("============ QUIZ 2 PRAKTIKUM ASD TI =============");
        System.out.println("Dibuat oleh\t: Danendra Nayaka Passadhi");
        System.out.println("NIM\t\t: 2341720144");
        System.out.println("Absen\t\t: 06");
        System.out.println(separator06);
        System.out.println("Sistem Antrian Resto Royal Delish");

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.print("Pilih (1-6) : ");
            int pilih06 = Danendra.nextInt();
            Danendra.nextLine();

            switch (pilih06) {
                case 1:
                    System.out.println(separator06);
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println(separator06);
                    int noAntri06 = antrian.size06 + 1;
                    
                    System.out.println("Nomor Antrian\t: " + noAntri06);
                    System.out.print("Nama Customer\t: ");
                    String nama06 = Danendra.nextLine();
                    System.out.print("Nomor Hp\t: ");
                    String nomorHp06 = Danendra.nextLine();

                    Pembeli06 pembeli06 = new Pembeli06(noAntri06, nama06, nomorHp06);
                    antrian.tambahAntrian(pembeli06);
                    break;

                case 2:
                    System.out.println(sep06);
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println(sep06);
                    antrian.cetakAntrian();
                    break;

                case 3:
                    System.out.printf("%s telah memesan menu\n", antrian.getFirst());
                    System.out.println(separator06);
                    System.out.println("Transaksi input makanan");
                    System.out.println(separator06);
                    System.out.print("Nomor pesanan\t: ");
                    int noPesanan06 = Danendra.nextInt();
                    Danendra.nextLine();
                    System.out.print("Pesanan\t\t: ");
                    String pesanan06 = Danendra.nextLine();
                    System.out.print("Harga\t\t: ");
                    int harga06 = Danendra.nextInt();
                    Danendra.nextLine();

                    Pesanan06 psn = new Pesanan06(noPesanan06, pesanan06, harga06);
                    pesan.tambah(psn);
                    antrian.hapusAntrian();

                    System.out.println(sep06);
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println(sep06);
                    System.out.printf("|%-3s|%-15s|%-12s|\n", "No.", "Nama Pesanan", "Harga");
                    System.out.printf("|%-3s|%-15s|%-12s|\n", noPesanan06, pesanan06, harga06);
                    System.out.println("\nSemua Pesanan Berhasil Dibuat\n");
                    break;

                case 4:
                    System.out.println(sep06);
                    System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
                    System.out.println(sep06);
                    pesan.sortAscending();
                    pesan.cetakPesanan();
                    break;

                case 5:
                    System.out.println(sep06);
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println(sep06);
                    System.out.println("Pendapatan hari ini : " + pesan.hitungTotalPendapatan());
                    break;

                case 6:
                    System.exit(0);
                    break;

                default:
                System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
