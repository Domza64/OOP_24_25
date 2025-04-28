package pckg_guess_age;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeGuessGame {
    private static Scanner scanner;
    private static ArrayList<Integer> guesses;

    public static void startGame(Player player) {
        guesses = new ArrayList<>();
        scanner = new Scanner(System.in);
        int randomAge = AUX_CLS.generateRandomAge();
        while (true) {
            int guess = AUX_CLS.enterGuess(scanner);
            logPlayerGuess(guess);
            if (guess == randomAge) {
                break;
            }
            else {
                AUX_CLS.helpText(guess, randomAge);
            }
        }
        player.addGameResult(guesses);
        System.out.println("Game finished");
        printGameStats();
    }

    public static void logPlayerGuess(int guess) {
        guesses.add(guess);
    }

    public static void printGameStats() {
        System.out.println("========== STATS ==========");
        System.out.println("Total attempts: " + guesses.size());
    }
}
