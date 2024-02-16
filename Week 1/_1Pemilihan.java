import java.util.Scanner;

public class _1Pemilihan {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            String separator = "==============================";
    
            System.out.println("Program menghitung Nilai akhir");
            System.out.println(separator);
    
            System.out.print("Masukkan Nilai Tugas\t: ");
            double nilaiTugas = input.nextDouble();
    
            System.out.print("Masukkan Nilai Kuis\t: ");
            double nilaiKuis = input.nextDouble();
    
            System.out.print("Masukkan Nilai UTS\t: ");
            double nilaiUts = input.nextDouble();
    
            System.out.print("Masukkan Nilai UAS\t: ");
            double nilaiUas = input.nextDouble();
    
            System.out.println(separator);
            System.out.println(separator);
    
            if (nilaiTugas <= 100 && nilaiKuis <= 100 && nilaiUts <= 100 && nilaiUas <= 100) {
    
                double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);
                String nilaiHuruf;
                if (nilaiAkhir > 80) {
                    nilaiHuruf = "A";
                } else if (nilaiAkhir > 73) {
                    nilaiHuruf = "B+";
                } else if (nilaiAkhir > 65) {
                    nilaiHuruf = "B";
                } else if (nilaiAkhir > 60) {
                    nilaiHuruf = "C+";
                } else if (nilaiAkhir > 50) {
                    nilaiHuruf = "C";
                } else if (nilaiAkhir > 39) {
                    nilaiHuruf = "D";
                } else {
                    nilaiHuruf = "E";
                }
                System.out.println("Nilai Akhir\t: " + nilaiAkhir);
                System.out.println("Nilai Huruf\t: " + nilaiHuruf);
                System.out.println(separator);
                System.out.println(separator);
    
                if (nilaiAkhir > 50) {
                    System.out.println("SELAMAT ANDA LULUS\n");
                } else {
                    System.out.println("MAAF ANDA TIDAK LULUS\n");
                }
            } else {
                System.out.println("Nilai tidak valid");
                System.out.println(separator);
                System.out.println(separator);
            }
    }
}