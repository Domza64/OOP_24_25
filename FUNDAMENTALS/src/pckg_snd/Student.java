package pckg_snd;

public class Student {
    private static int cntID = 100;

    private String name;
    private String university;
    private int id;
    private int yOfStudy;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
        this.id = cntID++;
    }

    public Student(String name, String university, int yOfStudy) {
        this(name, university);
        this.yOfStudy = yOfStudy;
    }

    public Student nextYearOfStudy() {
        System.out.println("Success - enrolled in the next study year!");
        this.yOfStudy++;
        return this;
    }
}
