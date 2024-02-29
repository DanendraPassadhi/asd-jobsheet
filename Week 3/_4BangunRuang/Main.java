package _4BangunRuang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kerucut[] kerucut = new Kerucut[1];
        Limas[] limas = new Limas[1];
        Bola[] bola = new Bola[1];
        boolean isSelected[] = new boolean[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nSistem Perhitungan Bangun Ruang\n");
            if (!isSelected[0]) {
                System.out.println("1. Kerucut ");
            }

            if (!isSelected[1]) {
                System.out.println("2. Limas Segi empat Sama Sisi ");
            }

            if (!isSelected[2]) {
                System.out.println("3. Bola");
            }

            System.out.print("Pilih: ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                isSelected[0] = true;
                System.out.print("Masukkan jari-jari : ");
                double jariJari = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double tinggi = input.nextDouble();
                kerucut[0] = new Kerucut(jariJari, tinggi);

            } else if (pilihan == 2) {
                isSelected[1] = true;
                System.out.print("Masukkan sisi : ");
                double sisi = input.nextDouble();
                System.out.print("Masukkan tinggi : ");
                double t = input.nextDouble();
                limas[0] = new Limas(sisi, t);

            } else if (pilihan == 3) {
                isSelected[2] = true;
                System.out.print("Masukkan jari-jari : ");
                double r = input.nextDouble();
                bola[0] = new Bola(r);
            }

        }

        System.out.println();
        System.out.println("Luas Permukaan kerucut : " + kerucut[0].hitungLuasPermukaan());
        System.out.println("Volume kerucut : " + kerucut[0].hitungVolume());

        System.out.println("Luas Permukaan limas : " + limas[0].hitungLuasPermukaan());
        System.out.println("Volume limas : " + limas[0].hitungVolume());

        System.out.println("Luas Permukaan bola : " + bola[0].hitungLuasPermukaan());
        System.out.println("Volume bola : " + bola[0].hitungVolume());
    }
}