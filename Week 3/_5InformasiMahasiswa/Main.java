package _5InformasiMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        infoMhs[] ArrayMhs = new infoMhs[3];

        for (int i = 0; i < ArrayMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Kelamin (L/P) : ");
            char kelamin = input.next().charAt(0);
            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            input.nextLine();

            ArrayMhs[i] = new infoMhs(nama, nim, kelamin, ipk);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            ArrayMhs[i].tampilMhs();
        }

        infoMhs ipkMhs = new infoMhs();
        double totalIP = ipkMhs.averageIpk(ArrayMhs[0].ipk, ArrayMhs[1].ipk, ArrayMhs[2].ipk);
        System.out.println("Rata-rata IPK : " + Math.round(totalIP * 100) / 100d);
        System.out.println();

        double ipkTerbesar = ipkMhs.ipkTerbesar(ArrayMhs[0].ipk, ArrayMhs[1].ipk, ArrayMhs[2].ipk);
        System.out.println("IPK terbesar yaitu " + ipkTerbesar + " diperoleh oleh :");

        int indexIpkTerbesar = 0;
        for (int i = 0; i < ArrayMhs.length; i++) {
            if (ArrayMhs[i].ipk > ArrayMhs[indexIpkTerbesar].ipk) {
                indexIpkTerbesar = i;
            }
        }
        System.out.println("Nama : " + ArrayMhs[indexIpkTerbesar].nama + "\nNIM : " + ArrayMhs[indexIpkTerbesar].nim + "\nIPK : " + ArrayMhs[indexIpkTerbesar].ipk);
    }
}
