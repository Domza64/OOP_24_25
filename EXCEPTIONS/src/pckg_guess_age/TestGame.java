package pckg_guess_age;

import java.util.Scanner;

public class TestGame {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
//        int age = AUX_CLS.generateRandomAge();
//        System.out.println(age);
//        boolean correctGuess = false;
//        while (!correctGuess) {
//            int guess = AUX_CLS.enterGuess(scanner);
//            if (guess == age) {
//                correctGuess = true;
//            }
//        }
//        System.out.println("correct.");
        Player player1 = new Player(new Person("Dominik"), "Domza");
        playNewGame(player1);

        player1.printGameStats();
    }

    public static void playNewGame(Player player) {
        boolean playAgain = true;
        while (playAgain) {
            AgeGuessGame.startGame(player);
            System.out.println("Play again? (Y/N)");
            if (scanner.nextLine().equalsIgnoreCase("n")) {
                playAgain = false;
            }
        }
    }
}
