package _4BangunRuang;

public class Limas {
    public double sisi;
    public double tinggi;

    public Limas(double s, double t) {
        sisi = s;
        tinggi = t;
    }

    public double hitungLuasPermukaan() {
        return ((sisi * sisi) + (4 * sisi * tinggi) / 2); 
    }
    
    public double hitungVolume() {
        return (sisi * sisi * tinggi) / 3;
    }
}
