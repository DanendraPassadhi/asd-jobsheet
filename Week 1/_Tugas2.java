import java.util.Scanner;

public class _Tugas2 {
    static Scanner input = new Scanner(System.in);

    static double s, v, t;

    static double kecepatan(double jarak, double waktu) {
        double jumlah = jarak / waktu;
        System.out.println("hasil : " + jumlah);

        return jumlah;
    }
    static double jarak(double kecepatan, double waktu) {
        double jumlah = kecepatan * waktu;
        System.out.println("hasil : " + jumlah);

        return jumlah;
    }
    static double waktu(double jarak, double kecepatan) {
        double jumlah = jarak / kecepatan;
        System.out.println("hasil : " + jumlah);

        return jumlah;
    }

    public static void main(String[] args) {

        System.out.println("---------Menu-----------");
        System.out.println("1. Menghitung Kecepatan");
        System.out.println("2. Menghitung Jarak");
        System.out.println("3. Menghitung Waktu");
        System.out.print("\nMasukkan pilihan : ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan jarak : ");
                s = input.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = input.nextDouble();

                kecepatan(s, t);
                break;

            case 2:
                System.out.print("Masukkan kecepatan : ");
                v = input.nextDouble();
                System.out.print("Masukkan waktu : ");
                t = input.nextDouble();

                jarak(v, t);
                break;

            case 3:
                System.out.print("Masukkan jarak : ");
                s = input.nextDouble();
                System.out.print("Masukkan kecepatan : ");
                v = input.nextDouble();

                waktu(s, v);
                break;

            default:
                break;
        }
    }
}
