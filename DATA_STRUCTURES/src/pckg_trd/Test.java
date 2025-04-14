package pckg_trd;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();

        Person person = new Person("Nera");

        people.add(new Person("Nicholas Najduze ime"));
        people.add(new Person("1234"));
        people.add(new Person("Dominik"));
        people.add(person);

        System.out.println(people);

        HashSet<Person> hashSet = new HashSet<>(people);
        TreeSet<Person> treeSet = new TreeSet<>(people);

        System.out.println(hashSet);
        System.out.println(treeSet);
    }
}
