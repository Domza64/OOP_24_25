package pckg_guess_age;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Player implements Serializable {
    private Person person;
    private String playerName;
    private HashMap<Integer, ArrayList<Integer>> gameStats;

    public Player(Person person, String playerName) {
        this.person = person;
        this.playerName = playerName;
        this.gameStats = new HashMap<>();
    }

    public void addGameResult(ArrayList<Integer> gameResult) {
        gameStats.put(gameStats.size() + 1, gameResult);
        System.out.println("New guess game result added for " + playerName);
    }

    public void printGameStats() {
        System.out.println("STATS: " + playerName);
        for (Integer i : gameStats.keySet()) {
            System.out.println(i + ": " + gameStats.get(i));
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "person=" + person +
                ", playerName='" + playerName + '\'' +
                ", gameStats=" + gameStats +
                '}';
    }

    public String toStringFileSave() {
        return person.toStringFileSave() + ";" + playerName;
    }
}
