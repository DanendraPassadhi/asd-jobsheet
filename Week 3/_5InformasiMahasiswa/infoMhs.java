package _5InformasiMahasiswa;

public class infoMhs {
    public String nama;
    public String nim;
    public char kelamin;
    public double ipk;

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
}

