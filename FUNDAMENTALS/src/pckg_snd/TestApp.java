package pckg_snd;

public class TestApp {

    public static void main(String[] args) {
        ServiceMan serviceMan = new ServiceMan(1031);
        Car car = new Car("Xsara Picasso", "Citroen");
        car.repairCar(serviceMan);
        car.setFailedToStart();
        car.repairCar(serviceMan);
        System.out.println(car);

        Car car2 = new Car("Y3", "Toyota", "1992", "Red");
    }
}
