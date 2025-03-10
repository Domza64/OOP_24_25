package pckg_uml;

public class App {

    public static void main(String[] args) {
        Boat b1 = new Boat();
        Yacht y1 = new Yacht();

        Boat[] boats = createBoats(3);
        boats[2] = new Yacht();
        System.out.println(boats[1]);
        testClassElements(boats);
    }

    static Boat[] createBoats(int numberOfBoats) {
        Boat[] boats = new Boat[numberOfBoats];
        for (int i = 0; i < boats.length; i++) {
            boats[i] = new Boat();
        }

        return boats;
    }

    static void testClassElements(Boat[] boats) {
        for (Boat boat : boats) {
            boat.run();
        }
    }
}
