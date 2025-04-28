package pckg_fst;

public class FlyingRobot extends ROBOT {
    private int flyingHours;

    protected FlyingRobot(String name) {
        super(name);
        this.flyingHours = 5;
    }

    @Override
    public void performTask() {
        if (flyingHours > 0) {
            flyingHours--;
            System.out.println("Flying robot " + name + " is flying...");
        }
        else {
            System.out.println("Flying robot " + name + " has empty tank, unable to fly...");
        }
    }

    @Override
    public void chargeRobot() {
        System.out.println("This robot is using fuel...");
        fuelRobot();
    }

    public void fuelRobot() {
        flyingHours = 5;
        System.out.println("Flying robot " + name + " is refilling fuel...");
    }
}
