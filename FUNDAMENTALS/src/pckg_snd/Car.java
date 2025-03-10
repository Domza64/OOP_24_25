package pckg_snd;

public class Car {
    private String model;
    private String brand;
    private String yOfProduction;
    private String color;
    private boolean failedToStart;

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
        this.failedToStart = false;
        System.out.println("Base constructor...");
    }

    public Car(String model, String brand, String yOfProduction, String color) {
        this(model, brand);
        this.yOfProduction = yOfProduction;
        this.color = color;
        System.out.println("Additional fields constructor...");
    }

    public void setFailedToStart() {
        this.failedToStart = true;
        System.out.println("Something went wrong with the car...");
    }

    public Car repairCar(ServiceMan serviceMan) {
        System.out.println(serviceMan.getClass().getSimpleName() + " repairing a car...");
        if (failedToStart) {
            System.out.println("Repairing...");
            this.failedToStart = false;
        } else {
            System.out.println("Already good car.");
        }
        return this;
    }

    public void carObjectInfo() {
        System.out.println(this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", failedToStart=" + failedToStart +
                '}';
    }
}
