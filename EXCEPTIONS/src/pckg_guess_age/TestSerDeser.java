package pckg_guess_age;

import java.util.ArrayList;
import java.util.List;

public class TestSerDeser {

    public static void main(String[] args) {
//        Player player = new Player(new Person("Dominik"), "Domza2");
//        player.addGameResult(new ArrayList<>(List.of(1, 5, 12, 66, 2, 33)));
//        AUX_CLS.savePlayerToFile(player, "somePlayer.bin");

        Player player = new Player(new Person("Dominik"), "Domza2");
        Player player2 = new Player(new Person("Nera"), "Nerchii");
        Player player3 = new Player(new Person("SomePlayer"), "playerplayer");

        AUX_CLS.savePlayerToTxt("players.txt", player);
        AUX_CLS.savePlayerToTxt("players.txt", player2);
        AUX_CLS.savePlayerToTxt("players.txt", player3);

        System.out.println(AUX_CLS.readPlayersFromTxt("players.txt"));

//        AUX_CLS.loadPlayerObjectsFromFile("somePlayer.bin");
        //player.printGameStats();
    }
}
