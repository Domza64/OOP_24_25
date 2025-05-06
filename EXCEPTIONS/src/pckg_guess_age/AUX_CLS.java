package pckg_guess_age;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

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

    public static void savePlayerListToFile(List<Player> playerList, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(playerList);
            System.out.println("Saved players to file...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void savePlayerToFile(Player player, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath, true))) {
            oos.writeObject(player);
            System.out.println("Player saved to " + filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void savePlayerToTxt(String filePath, Player player) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(player.toStringFileSave());
            bw.newLine();
            System.out.println("Player saved to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Player> readPlayersFromTxt(String filePath) {
        ArrayList<Player> players = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            for (String line : lines) {
                Player player = new Player(new Person(line.split(";")[0]), line.split(";")[1]);
                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return players;
    }

    public static ArrayList<Player> loadPlayerObjectsFromFile(String filePath) {
        ArrayList<Player> players = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath)) {
            while (fis.available() > 0) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                Player player = (Player) ois.readObject();
                players.add(player);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return players;
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

    public static ArrayList<Player> loadPlayersFromFile(String filePath) {
        ArrayList<Player> players = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            players = (ArrayList<Player>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return players;
    }
}
