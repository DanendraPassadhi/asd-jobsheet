package _3SumArray;

import java.util.Scanner;

class Perusahaan {
    String nama;
    int jmlBulan;
    double keuntungan[], total;

    Perusahaan(String nama, int jmlBulan) {
        this.nama = nama;
        this.jmlBulan = jmlBulan;
        this.keuntungan = new double[jmlBulan];
        this.total = 0;
    }

    void setKeuntungan (int bulan, double untung) {
        this.keuntungan[bulan] = untung;
    }

    double keuntungan() {
        double total = 0;
        for (int i = 0; i < jmlBulan; i++) {
            total += keuntungan[i];
        }
        return total;
    }
}

public class SumMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String separator = "==============================================================";
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int jmlPerusahaan = sc.nextInt();
        
        Perusahaan[] daftarPerusahaan = new Perusahaan[jmlPerusahaan];
        System.out.println(separator);
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Masukkan nama perusahaan : ");
            String nama = sc.nextLine();
            System.out.println("Masukkan jumlah bulan : ");
            int jmlBulan = sc.nextInt();
            
            Perusahaan perusahaan = new Perusahaan(nama, jmlBulan);
            for (int j = 0; j < jmlBulan; j++) {
                System.out.println("Masukkan keuntungan bulan ke-" + (j+1) + " : ");
                double untung = sc.nextDouble();
                perusahaan.setKeuntungan(j, untung);
            }
            daftarPerusahaan[i] = perusahaan;
        }
        
        System.out.println(separator);
        for (Perusahaan perusahaan : daftarPerusahaan) {
            System.out.println("Total keuntungan perusahaan " + perusahaan.nama + " selama " 
            + perusahaan.jmlBulan + " bulan adalah " + perusahaan.keuntungan());
        }
        System.out.println(separator);
    }
}