package _1Searching;

import java.util.Scanner;

public class BukuMain06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku06 data = new PencarianBuku06();
        int jumBuku = 5;

        System.out.println("----------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("------------------");
            System.out.print("Kode Buku \t: ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();
            s.nextLine();

            Buku06 m = new Buku06(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("______________________________________________");
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data");
        System.out.println("1. Berdasarkan kode buku");
        System.out.println("2. Berdasarkan judul buku");
        System.out.print("Pilih : ");
        int pilih = s.nextInt();
        s.nextLine();

        switch (pilih) {
            case 1:
                System.out.println("Masukkan kode buku yang dicari : ");
                System.out.print("Kode buku : ");
                String cari = s.nextLine();
                System.out.println("menggunakan sequential search");
                int posisi = data.FindSeqSearch(cari);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);

                Buku06 dataBuku = data.FindBuku(cari);
                dataBuku.tampilDataBuku();

                System.out.println("====================================");
                System.out.println("menggunakan binary search");
                posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
                break;

            case 2:
                data.Sort();
                System.out.println("Masukkan judul buku yang dicari : ");
                System.out.print("Judul buku : ");
                cari = s.nextLine();

                int jmlJudul = data.hitungJudul(cari);
                if (jmlJudul > 1) {
                    System.out.println("Peringatan : Ditemukan lebih dari satu buku dengan judul " + "\""+ cari+ "\"");
                    break;
                }

                System.out.println("menggunakan sequential search");
                posisi = data.SequentialSearchByTitle(cari);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);

                System.out.println("====================================");
                System.out.println("menggunakan binary search");
                posisi = data.BinarySearchByTitle(cari, 0, jumBuku - 1);
                data.TampilPosisi(cari, posisi);
                data.TampilData(cari, posisi);
                break;

            default:
                break;
        }
    }
}
