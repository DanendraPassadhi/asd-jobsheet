import java.util.Scanner;

public class MaskpaiMain06 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        Maskapai06[] Array06 = new Maskapai06[5];

        for (int i = 0; i < Array06.length; i++) {
            System.out.println("Masukkan data Maskapai ke-" + (i+1));
            System.out.print("Nomor Penerbangan : ");
            String nomor06 = input06.nextLine();
            System.out.print("Tujuan Penerbangan : ");
            String tujuan06 = input06.nextLine();
            System.out.print("Harga tiket : ");
            int tiket06 = input06.nextInt();
            System.out.print("Jumlah kursi tersedia : ");
            int tersedia06 = input06.nextInt();
            System.out.print("Jumlah penumpang terdaftar : ");
            int terdaftar06 = input06.nextInt();
            input06.nextLine();
            
            Array06[i] = new Maskapai06(nomor06, tujuan06, tiket06, tersedia06, terdaftar06); 
        }

        System.out.println("=== Menu ===");
        System.out.println("1. Tampilkan seluruh data Maskapai");
        System.out.println("2. Cari Maskapai yang paling banyak penumpangnya");
        System.out.println("3. Tampilkan Maskapai berdasar kursi tersedia");
        System.out.print("Pilih : ");
        int pilih06 = input06.nextInt();

        Maskapai06 pilihan06 = new Maskapai06();

        switch (pilih06) {
            case 1:
            for (int i = 0; i < Array06.length; i++) {
                System.out.println("Data Maskapai ke-" + (i + 1));
                Array06[i].tampil06();
            }
                break;
            case 2:
                int maxPenumpang06 = Array06[0].terdaftar06;
                int max06 = 0;
                for (int i = 1; i < Array06.length; i++) {
                    if (Array06[i].terdaftar06 > maxPenumpang06) {
                        maxPenumpang06 = Array06[i].terdaftar06;
                        max06 = i;
                    }
                }
                System.out.println("Maskapai dengan penumpang terbanyak:");
                Array06[max06].tampil06();
                break;
            case 3:
                pilihan06.daftarMaskapai06();
                break;
        
            default:
            System.out.println("Inputan anda salah");
                break;
        }
    }
}