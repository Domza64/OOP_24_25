package pckg_inner;

public class AppTest {

    public static void main(String[] args) {
        Building building = new Building("Vukovarska", 2, 5);
        building.provideBuildingInfo();
        building.getSomeFloorInfo();
    }
}
