package _4BangunRuang;

public class Kerucut {
    public double jariJari;
    public double sisiMiring;
    public double phi = 3.14;

    public Kerucut(double r, double sm) {
        jariJari = r;
        sisiMiring = sm;
    }

    public double hitungLuasPermukaan() {
        return phi * jariJari * (jariJari + sisiMiring);
    }

    public double hitungVolume() {
        return (phi * jariJari * jariJari * Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari))) / 3;
    }
}
