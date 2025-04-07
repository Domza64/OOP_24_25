package pckg_polymorphism;

public class Dog extends Animal {

    @Override
    public void makeSomeSound(int soundVolume) {
        System.out.println("Woof, Woof!");
    }
}
