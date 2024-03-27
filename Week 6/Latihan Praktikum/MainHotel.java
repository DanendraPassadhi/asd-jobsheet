import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String separator = "========================================";

        HotelService service = new HotelService();

        service.tambah(new Hotel("Cendana", "Malang", 200000, (byte) 1));
        service.tambah(new Hotel("Cempaka", "Malang", 300000, (byte) 2));
        service.tambah(new Hotel("Nusantara", "Malang", 2000000, (byte) 4));
        service.tambah(new Hotel("Pahlawan", "Surabaya", 2500000, (byte) 5));
        service.tambah(new Hotel("Patriot", "Surabaya", 1000000, (byte) 3));

        System.out.println(separator);
        System.out.println("DAFTAR PENGINAPAN TERSEDIA");
        service.tampilAll();
        System.out.println(separator);

        System.out.println("Silahkan pilih filter yang diinginkan\n");
        System.out.println("1. Harga termurah ke harga termahal");
        System.out.println("2. Bintang tertinggi ke bintang terendah");
        System.out.print("pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                service.bubbleSort();
                service.tampilAll();
                break;

            case 2:
                service.selectionSort();
                service.tampilAll();
                break;

            default:
                System.out.println("Maaf inputan anda salah, Silahkan coba lagi");
                break;
        }
        System.out.println(separator);
    }
}
