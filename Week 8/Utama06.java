import java.util.Scanner;

public class Utama06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tentukan kapasitas gudang : ");
        int pilih = sc.nextInt();
        sc.nextLine();

        Gudang06 gudang = new Gudang06(pilih);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang06 barangBaru = new Barang06(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                
                case 6:
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
                    break;
            }
        }
    }
}
