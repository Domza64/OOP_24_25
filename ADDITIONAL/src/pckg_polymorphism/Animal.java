package pckg_polymorphism;

public class Animal {

    public void makeSomeSound(int soundVolume) {
        System.out.println("Making some basic animal sound - volume: " + soundVolume);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
