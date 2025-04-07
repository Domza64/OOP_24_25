package pckg_polymorphism;

public class SmartTV extends TV {

    public SmartTV() {
        System.out.println("This is from SmartTV constructor: " + this.getClass().getSimpleName());
    }
}
