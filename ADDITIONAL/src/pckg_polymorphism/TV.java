package pckg_polymorphism;

public class TV extends Device {
    public TV() {
        System.out.println("This is from TV constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public void powerOn() {
        System.out.println("Power on the TV with remote controller.");
    }

    public void changeChannel() {
        System.out.println("Changing channel...");
    }
}
