package pckg_fst;

import java.util.ArrayList;
import java.util.List;

public class TEST {

    public static void main(String[] args) {
        List<ROBOT> robots = new ArrayList<>();
        robots.add(new CleaningRobot("Misko"));
        robots.add(new FlyingRobot("Jovanko"));
        robots.add(new FlyingRobot("Miko"));
        robots.add(new FlyingRobot("Špiro"));

        performAllTasks(robots);
    }

    private static void performAllTasks(List<ROBOT> robots) {
        for (ROBOT robot : robots) {
            robot.performTask();
        }
    }
}