package pckg_osnovni_vecera;

import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.GlavnoJelo;

public class AppTest {

    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Juha", 12.2);
        GlavnoJelo glavnoJelo = new GlavnoJelo("Meso i njoke", 23.12);
        Desert desert = new Desert("Mafini", 6.2);

        Vecera vecera = new Vecera(predjelo, glavnoJelo, desert);
        System.out.println(vecera.finalPrice());
    }
}
