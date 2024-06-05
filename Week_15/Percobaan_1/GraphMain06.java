package Week_15.Percobaan_1;

import java.util.Scanner;

public class GraphMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Graph06 gedung = new Graph06(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        System.out.print("Masukkan gedung asal: ");
        int asal = sc.nextInt();
        System.out.print("Masukkan gedung tujuan: ");
        int tujuan = sc.nextInt();

        if (gedung.isAdjacent(asal, tujuan)) {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char) ('A' + asal) + " dan Gedung " + (char) ('A' + tujuan) + " tidak bertetangga");
        }
    }
}
