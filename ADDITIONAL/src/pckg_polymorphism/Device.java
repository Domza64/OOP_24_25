package pckg_polymorphism;

public class Device {
    public Device() {
        System.out.println("This is from device: " + this.getClass().getSimpleName());
    }

    public void powerOn() {
        System.out.println("Power on");
    }
}
