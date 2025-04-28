package pckg_fst;

public abstract class ROBOT {

    private static int cntID = 200;
    protected int id;
    protected String name;

    protected ROBOT(String name) {
        this.name = name;
        this.id = cntID++;
    }

    public abstract void performTask();

    public abstract void chargeRobot();

    @Override
    public String toString() {
        return "ROBOT{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
