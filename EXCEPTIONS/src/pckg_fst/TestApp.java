package pckg_fst;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestApp {
    private static Scanner scanner;

    public static void main(String[] args) {
//        scanner = new Scanner(System.in);
//        System.out.print("Please enter one integer number: ");
//        int number = 0;
//        try {
//            number = scanner.nextInt();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("You have entered: " + number);
//
//        readTxtFile("asdsad");

        AUX_CLS.readTxtFileContent("some/file.txt");

    }

    private static void readTxtFile(String filePath) {
        try {
            scanner = new Scanner(new File(filePath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
