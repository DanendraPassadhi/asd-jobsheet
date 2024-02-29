package _5InformasiMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        infoMhs[] ArrayMhs = new infoMhs[3];

        for (int i = 0; i < ArrayMhs.length; i++) {
        }
        
        for (int i = 0; i < ArrayMhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
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
    }
}
