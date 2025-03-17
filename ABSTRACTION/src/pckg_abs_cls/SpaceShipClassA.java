package pckg_abs_cls;

public class SpaceShipClassA extends SpaceShip {
    private long numberOfMissions;

    protected SpaceShipClassA(String firstFlight, String name) {
        super(firstFlight, name);
        numberOfMissions = 0;
    }

    @Override
    public void flyFromPlanet() {
        super.flyFromPlanet();
        numberOfMissions++;
    }

    @Override
    protected void performHSpaceJump() {
        System.out.println("This old crump of metal cannot do it :(");
    }

    @Override
    public void performAttackWithBlasters() {
        System.out.println("Attacking with blasters...");
    }

    @Override
    public void performAttackWithPlasmaGun() {
        System.out.println("Attacking with plasma gun");
    }
}
