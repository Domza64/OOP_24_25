package pckg_abs_cls;

public abstract class SpaceShip implements FightMode {

    protected String name;
    protected String firstFlight;

    protected SpaceShip(String firstFlight, String name) {
        this.firstFlight = firstFlight;
        this.name = name;
    }

    protected abstract void performHSpaceJump();

    public void flyFromPlanet() {
        System.out.println(this.getClass().getSimpleName() + " flying from the planet!");
    }
}
