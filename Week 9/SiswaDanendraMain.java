import java.util.Scanner;

public class SiswaDanendraMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SiswaDanendra[] arrDanendra = new SiswaDanendra[6];
        adminSiswaDanendra admin = new adminSiswaDanendra(arrDanendra);

        for (int i = 0; i < arrDanendra.length; i++) {
            System.out.println("Masukkan data siswa ke-" + (i + 1));
            System.out.print("NISN\t\t: ");
            String nisnDanendra = sc.nextLine();
            System.out.print("Nama\t\t: ");
            String namaDanendra = sc.nextLine();
            System.out.print("Alamat\t\t: ");
            String alamatDanenra = sc.nextLine();
            System.out.print("Tahun Masuk\t: ");
            int tahunDanendra = sc.nextInt();
            System.out.print("Nilai Rata-Rata\t: ");
            double nilaiDanendra = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            arrDanendra[i] = new SiswaDanendra(nisnDanendra, namaDanendra, alamatDanenra, tahunDanendra, nilaiDanendra);
        }

        boolean ulangi = true;
        while (ulangi) {
            System.out.println("============================ MENU ============================");
            System.out.println("1. Menampilkan seluruh data siswa");
            System.out.println("2. Mencari data siswa berdasarkan nisn");
            System.out.println("3. Mengurutkan data siswa dari yang tertinggi hingga terendah");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("==============================================================");
                    System.out.println("Data Keseluruhan Siswa SMA\n");
                    for (int i = 0; i < arrDanendra.length; i++) {
                        System.out.println("Data Siswa ke-" + (i + 1));
                        arrDanendra[i].tampilData();
                        System.out.println();
                    }
                    System.out.println("==============================================================");
                    break;

                case 2:
                    System.out.println("==============================================================");
                    System.out.print("Masukkan nisn siswa: ");
                    String cari = sc.nextLine();
                    admin.sortingNISN();
                    int idx = admin.cariSiswa(cari, 0, arrDanendra.length - 1);

                    if (idx == -1) {
                        System.out.println("==============================================================");
                        arrDanendra[idx].tampilData();
                        System.out.println("==============================================================");
                    } else {
                        System.out.println("Siswa dengan NISN tersebut tidak ditemukan");
                    }

                    break;

                case 3:
                    admin.pengurutanSiswa();
                    System.out.println("==============================================================");
                    System.out.println("Data Nilai Siswa Tertinggi hingga Terendah");

                    for (int i = 0; i < arrDanendra.length; i++) {
                        arrDanendra[i].tampilData();
                        System.out.println();
                    }
                    System.out.println("==============================================================");
                    break;

                case 4:
                    System.out.println();
                    System.out.println("Keluar program...");
                    System.out.println();
                    ulangi = false;
                    break;

                default:
                    System.out.println("Maaf inputan anda salah");
                    break;
            }
        }
    }
}
