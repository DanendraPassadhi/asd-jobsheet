import java.util.Scanner;

public class _Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char KODE[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char KOTA[][] = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        System.out.print("Masukkan plat nomor (Dalam Kapital) : ");
        char plat = input.next().charAt(0);

        for (int i = 0; i < KODE.length; i++) {
            if (plat == KODE[i]) {

                String kota = "";
                for (int j = 0; j < KOTA[i].length; j++) {
                    kota += KOTA[i][j];
                }
                System.out.println("Nama Kota : " + kota);
                return;
            }
        }
    }
}
