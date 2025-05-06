package pckg_guess_age;

import java.util.ArrayList;

public class TestSerDeser2 {

    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        populatePlayers(players, 5);
        listAllPlayers(players);
        AUX_CLS.savePlayerListToFile(players, "players.bin");
        ArrayList<Player> loadedPlayers = AUX_CLS.loadPlayersFromFile("players.bin");
        listAllPlayers(loadedPlayers);
    }

    private static void populatePlayers(ArrayList<Player> players, int numPlayers) {
        for (int i = 0; i <= numPlayers; i++) {
            Player player = new Player(new Person("Player" + i), "GamePlayer_" + i);
            players.add(player);
        }
        System.out.println("All players added to list");
    }

    private static void listAllPlayers(ArrayList<Player> players) {
        for (Player player: players) {
            System.out.println(player);
        }
    }
}
