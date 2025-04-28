package pckg_fst;

public class CleaningRobot extends ROBOT {
    private int cleaningHours;

    public CleaningRobot(String name) {
        super(name);
        this.cleaningHours = 5;
    }

    @Override
    public void performTask() {
        if (cleaningHours > 0) {
            cleaningHours--;
            System.out.println("Cleaning robot " + name + " is cleaning some space...");
        }
        else {
            System.out.println("Cleaning robot " + name + " has no more battery.");
        }
    }

    @Override
    public void chargeRobot() {
        cleaningHours = 5;
        System.out.println("Cleaning robot " + name + " is charging...");
    }
}
