package pckg_guess_age;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AUX_CLS {
    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 150;
    private static final Random random = new Random();

    public static int generateRandomAge() {
        return random.nextInt(MAX_AGE - MIN_AGE);
    }

    public static int enterGuess(Scanner scanner) {
        System.out.printf("Enter your guess (%s - %s): ", MAX_AGE, MIN_AGE);
        int guess = enterGuessInteger(scanner);
        if (guess < MIN_AGE || guess > MAX_AGE) {
            System.out.printf("Not in range (%s - %s)%n", MIN_AGE, MAX_AGE);
            return enterGuess(scanner);
        }
        return guess;
    }

    public static int enterGuessInteger(Scanner scanner) {
        int guess = -1;
        try {
            System.out.printf("Enter your guess (%s - %s): ", MAX_AGE, MIN_AGE);
            guess = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again");
        }
        return guess;
    }

    public static void helpText(int guess, int numbertoGuess) {
        if (guess > numbertoGuess) {
            System.out.println("Enter smaller number");
        } else if (guess < numbertoGuess) {
            System.out.println("Enter larger number");
        }
    }

    public static void savePlayerToFile(Player player, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(player);
            System.out.println("Player saved to " + filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Player loadPlayerFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Player) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
