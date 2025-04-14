package pckg_fst;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        double db;
        System.out.println("Enter one double value...");
        db = scanner.nextDouble();
        System.out.println(db);
    }
}