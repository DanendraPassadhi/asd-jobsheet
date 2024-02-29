package _5InformasiMahasiswa;

public class infoMhs {
    public String nama;
    public String nim;
    public char kelamin;
    public double ipk;

    public infoMhs() {

    }

    public infoMhs(String nama, String nim, char kelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelamin = kelamin;
        this.ipk = ipk;
    }

    public void tampilMhs() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelamin: " + (kelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("IPK: " + ipk);
        System.out.println();
    }

    public double averageIpk(double ipk, double ipk2, double ipk3) {
        return (ipk + ipk2 + ipk3) / 3;
    }

    public double ipkTerbesar(double ipk, double ipk2, double ipk3) {
        return Math.max(ipk, Math.max(ipk2, ipk3));
    }
}

