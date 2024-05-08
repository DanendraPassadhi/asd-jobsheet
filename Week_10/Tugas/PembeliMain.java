import java.util.Scanner;

public class PembeliMain {
    public static void Menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian paling depan");
        System.out.println("4. Cek semua Antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("6. Tampilkan seluruh data pembeli");
        System.out.println("--------------------------");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue3 antrian = new Queue3(10);

        int pilih;
        do {
            Menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHP = sc.nextInt();
                    sc.nextLine();

                    Pembeli n = new Pembeli(nama, noHP);
                    antrian.Enqueue(n);
                    break;

                case 2:
                    Pembeli data = antrian.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.peekRear();
                    break;

                case 6:
                    antrian.daftarPembeli();
                    break;

                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 ||pilih == 6);
    }
}
