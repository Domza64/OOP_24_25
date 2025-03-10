package pckg_uml;

public class Yacht extends Boat implements Turbo {
    @Override
    public void run() {
        System.out.println("Yacht running");
    }

    @Override
    public void goToTurboMode() {
        System.out.println("Going fast...");
    }
}
