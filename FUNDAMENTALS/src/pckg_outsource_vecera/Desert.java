package pckg_outsource_vecera;

public class Desert {
    private String naziv;
    private double cijena;

    public Desert(String naziv, double cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public double getPrice() {
        return this.cijena;
    }

    void pojeoSamDesert() {
        System.out.println("Desert je smazan...");
    }
}
