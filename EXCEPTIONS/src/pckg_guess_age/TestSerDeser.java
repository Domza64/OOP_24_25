package pckg_guess_age;

import java.util.ArrayList;
import java.util.List;

public class TestSerDeser {

    public static void main(String[] args) {
//        Player player = new Player(new Person("Dominik"), "Domza64");
//        player.addGameResult(new ArrayList<>(List.of(1, 5, 12, 66, 2, 33)));
//        AUX_CLS.savePlayerToFile(player, "somePlayer.bin");

        Player player = AUX_CLS.loadPlayerFromFile("somePlayer.bin");
        player.printGameStats();
    }
}
