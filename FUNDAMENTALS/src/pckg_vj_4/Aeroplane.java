package pckg_vj_4;

public class Aeroplane extends Vehicle {
    private int numberOfEngines;

    public Aeroplane(String model) {
        super(model);
    }

    public Aeroplane(String brand, String model) {
        super(brand, model);
    }

    public Aeroplane(String brand, String model, int numberOfEngines) {
        super(brand, model);
        this.numberOfEngines = numberOfEngines;
    }

    public void flyWithOneEngine() {

    }

    @Override
    protected void info() {
        System.out.println("This is an aeroplane...");
    }
}
