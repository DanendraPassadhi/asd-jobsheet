import java.util.Scanner;

public class _4Fungsi {
    static Scanner input = new Scanner(System.in);
    static String cabBunga[][] = {
            { "Aglonema", "Keladi", "Alocasia", "Mawar" },
            { "RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4" }
    };
    static int stockBunga[][] = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 },
    };
    static int bungaCab4[] = { 1, 2, 0, 5 };
    
    static void pendapatan() {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;

        for (int i = 0; i < stockBunga.length; i++) {
            totalAglonema += stockBunga[0][i] * 75000;
        }
        for (int i = 0; i < stockBunga.length; i++) {
            totalKeladi += stockBunga[i][1] * 50000;
        }
        for (int i = 0; i < stockBunga.length; i++) {
            totalAlocasia += stockBunga[i][2] * 60000;
        }
        for (int i = 0; i < stockBunga.length; i++) {
            totalMawar += stockBunga[i][3] * 10000;
        }
        System.out.println("Cabang RoyalGarden 1: Rp " + totalAglonema);
        System.out.println("Cabang RoyalGarden 2: Rp " + totalKeladi);
        System.out.println("Cabang RoyalGarden 3: Rp " + totalAlocasia);
        System.out.println("Cabang RoyalGarden 4: Rp " + totalMawar);
    }

    static void royalGarden4() {
        for (int i = 0; i < stockBunga.length; i++) {
            stockBunga[3][i] -= bungaCab4[i];
        }

        for (int i = 0; i < bungaCab4.length; i++) {
            System.out.printf("Total stock bunga %-8s: %s\n", cabBunga[0][i],
                    stockBunga[3][i]);
        }
    }

    public static void main(String[] args) {
        String separator = "=====================================================================";

        System.out.println(separator);
        System.out.println("Total Pendapatan Cabang RoyalGarden Saat Semua Bunga Habis Terjual");
        System.out.println(separator);
        pendapatan();
        System.out.println(separator);

        System.out.println();

        System.out.println(separator);
        System.out.println("Total Stok Bunga di Cabang 4 dengan Pengurangan karena Bunga Mati");
        System.out.println(separator);
        royalGarden4();
        System.out.println(separator);
    }
}