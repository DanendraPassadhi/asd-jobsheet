package _4BangunRuang;

public class Bola {
    public double jariJari;
    public double phi = 3.14;

    public Bola(double r) {
        jariJari = r;
    }

    public double hitungLuasPermukaan() {
        return 4 * phi * jariJari * jariJari;
    }
    
    public double hitungVolume() {
        return (4 * phi * jariJari * jariJari * jariJari) / 3;
    }

}
