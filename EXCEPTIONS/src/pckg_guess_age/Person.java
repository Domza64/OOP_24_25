package pckg_guess_age;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int id;
    private static int CNT_ID = 10;

    public Person(String name) {
        this.name = name;
        this.id = CNT_ID++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String toStringFileSave() {
        return name + ";" + id;
    }
}
