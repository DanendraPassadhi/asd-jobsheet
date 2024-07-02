import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kendaraan kendaraan = new Kendaraan();
        TransaksiPajak transaksi = new TransaksiPajak();

        String separator = "==================================================";
        String sep = "+++++++++++++++++++++++++";

        kendaraan.tambahAntrian(new Kendaraan("S 4567 YV", "Basko", "Mobil", 2000, 2012, 4));
        kendaraan.tambahAntrian(new Kendaraan("N 4511 VS", "Arta", "Mobil", 2500, 2015, 3));
        kendaraan.tambahAntrian(new Kendaraan("AB 4321 A", "Wisnu", "Motor", 125, 2010, 2));
        kendaraan.tambahAntrian(new Kendaraan("B 1234 AG", "Sisa", "Motor", 150, 2020, 1));

        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi berdasar pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-6) : ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println(sep);
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println(sep);
                    kendaraan.cetakDaftar();
                    break;

                case 2:
                    System.out.println(separator);
                    System.out.println("Masukkan Data Pembayaran");
                    System.out.println(separator);
                    System.out.print("Masukkan Nomer TNKB: ");
                    String tnkb = sc.nextLine();
                    System.out.print("Bulan Bayar: ");
                    int bulanBayar = sc.nextInt();
                    sc.nextLine();
                    Kendaraan k = kendaraan.cariKendaraan(tnkb);
                    if (k != null) {
                        long nominalBayar = transaksi.hitungNominalBayar(k);
                        long denda = transaksi.hitungDenda(k, bulanBayar);
                        System.out.printf("|%-5s|%-15s|%-10s|%-10s|%-10s|\n", "Kode", "TNKB", "Nama", "Nominal",
                                "Denda");
                        System.out.printf("|%-5d|%-15s|%-10s|%-10d|%-10d|\n", 1, k.getTNKB(), k.getNamaPemilik(),
                                nominalBayar, denda);
                    } else {
                        System.out.println("Kendaraan tidak ditemukan.");
                    }
                    break;

                case 3:
                    System.out.println(sep);
                    System.out.println("Daftar Transaksi Pembayaran Pajak");
                    System.out.println(sep);
                    transaksi.cetakDaftar();
                    System.out.println(sep);
                    System.out.println("TOTAL PENDAPATAN");
                    System.out.println(sep);
                    System.out.println("Pendapatan hari ini : " +
                    transaksi.hitungTotalPendapatan());
                    break;

                case 4:
                    transaksi.sortAscending();
                    System.out.printf("|%-5s|%-15s|%-10s|%-10s|%-10s|\n", "Kode", "TNKB", "Nama", "Nominal", "Denda");
                    System.out.printf("|%-5d|%-15s|%-10s|%-10d|%-10d|\n", 1, kendaraan.getTNKB(), kendaraan.getNamaPemilik(),
                            transaksi.nominalBayar, transaksi.denda);
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }
    }
}
