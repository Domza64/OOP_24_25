package pckg_vj_4;

import java.util.Date;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Date productionDate;

    private int vehID;

    private static int cntID = 10;
    private static final String DatePattern = "dd.MM.yyyy.";

    protected Vehicle(String model) {
        this.model = model;
        this.vehID = cntID++;
    }

    protected Vehicle(String brand, String model) {
        this(model);
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting: " + this.getClass().getSimpleName());
    }

    public void stop() {
        System.out.println("Stopping: " + this.getClass().getSimpleName());
    }

    protected abstract void info();
}
