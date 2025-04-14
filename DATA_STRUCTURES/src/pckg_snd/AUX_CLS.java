package pckg_snd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class AUX_CLS {
    private static Scanner scanner;

    public static void readFromFile(String filePath) {
        Path path = Paths.get(filePath);
        try {
            Scanner scanner = new Scanner(path);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String[]> readQuotes(String filePath) {
        Path path = Paths.get(filePath);
        List<String[]> listaStringova = new LinkedList<>();
        try {
            scanner = new Scanner(path);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" - ", 2);
                listaStringova.add(parts);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaStringova;
    }

    public static void listArrayListElements(List<String[]> quotes) {
        for (String[] quote : quotes) {
            System.out.println(quote[0] + " - " + quote[1]);
        }
    }

    public static Map<String, ArrayList<String>> linkAuthorAndQuotes(List<String[]> quotes) {
        Map<String, ArrayList<String>> authorQuotes = new HashMap<>();

        for (String[] data : quotes) {
            String author = data[0];
            String quote = data[1];

            addNewQuote(author, quote, authorQuotes);
        }

        return authorQuotes;
    }

    public static void addNewQuote(String author, String quote, Map<String, ArrayList<String>> authorQuotes) {
        if (authorQuotes.containsKey(author)) {
            authorQuotes.get(author).add(quote);
        }
        else {
            authorQuotes.put(author, new ArrayList<>(List.of(quote)));
        }
    }

    public static void readAuthorAndQuotes(Map<String, ArrayList<String>> authorQuotes) {
        for (String author : authorQuotes.keySet()) {
            System.out.println(author + ":");
            for (String quote : authorQuotes.get(author)) {
                System.out.println(quote);
            }
            System.out.println("------------------------");
        }
    }

    public static void writeQuotesToFile(String filePath, Map<String, ArrayList<String>> authorQuotes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String author : authorQuotes.keySet()) {
                bw.write(author + ":\n");
                for (String quote : authorQuotes.get(author)) {
                    bw.write(quote + "\n");
                }
                bw.write("-".repeat(20) + "\n");
            }
            System.out.println("Successfully wrote quotes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void analyzeAuthorQuotes(Map<String, ArrayList<String>> quotesMap) {
        for (String author : quotesMap.keySet()) {
            System.out.println("Author: " + author + " has: " + quotesMap.get(author).size() + " quotes");
        }
    }
}
