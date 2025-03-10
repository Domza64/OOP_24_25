package pckg_snd;

public class ServiceMan {
    private int id;

    public ServiceMan(int id) {
        this.id = id;
    }

    public Car repairCar(Car car) {
        System.out.println("ServiceMan: " + this.id + " repairing car.");
        return car.repairCar(this);
    }
}
