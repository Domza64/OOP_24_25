package pckg_trd;

import java.util.Stack;

public class TestApp {

    public static void main(String[] args) {
        Stack<Person> stackedPeople = new Stack<>();

        stackedPeople.add(new Person("Nera"));
        stackedPeople.add(new Person("Franjo"));
        stackedPeople.add(new Person("John Smith"));
        stackedPeople.add(new Person("Nicholas Šmus"));

        System.out.println(stackedPeople);
        Person person = stackedPeople.pop();
        System.out.println(person);
        System.out.println(stackedPeople);

        reverseString("This is some string...");
        reverseString("dwasd");
    }

    private static void reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        System.out.println(reversedString);
    }
}
