package pckg_osnovni_vecera;

import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.GlavnoJelo;

public class Vecera {
    private Predjelo predjelo;
    private GlavnoJelo glavnoJelo;
    private Desert desert;

    public Vecera(Predjelo predjelo, GlavnoJelo glavnoJelo, Desert desert) {
        this.predjelo = predjelo;
        this.glavnoJelo = glavnoJelo;
        this.desert = desert;
    }

    public double finalPrice() {
        return predjelo.getPrice() + glavnoJelo.getPrice() + desert.getPrice();
    }
}
