package pckg_inner;

public class Building {

    private String street;
    private int number;
    private int numberOfFloors;
    private BuildingFloor[] floors;

    public Building(String street, int number) {
        this(street, number, 0);
    }

    public Building(String street, int number, int numberOfFloors) {
        this.street = street;
        this.number = number;
        this.numberOfFloors = numberOfFloors;
        buildBuilding();
    }

    public void provideBuildingInfo() {
        System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));
        for (BuildingFloor floor : floors) {
            floor.getFloorInfo();
        }
    }

    public void getSomeFloorInfo() {
        BuildingFloor floor = new BuildingFloor();
        floor.getFloorInfo();
    }

    private void buildBuilding() {
        floors = new BuildingFloor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new BuildingFloor();
        }
    }

    class BuildingFloor {
        public void getFloorInfo() {
            System.out.println("This is some building floor info:");
            System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));
        }
    }

    public void specialLocalBuildingFeature() {
        class BuildingCompanyService {
            String name;
            String registeredIn;

            public BuildingCompanyService(String name, String registeredIn) {
                this.name = name;
                this.registeredIn = registeredIn;
            }

            void performSomeService() {
                System.out.println("Performing meintnance on: " + street);
            }
        }

        BuildingCompanyService bcs = new BuildingCompanyService("Some Company", "Germany");
        bcs.performSomeService();
    }
}
