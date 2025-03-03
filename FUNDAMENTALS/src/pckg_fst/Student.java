package pckg_fst;

public class Student {
    private String name;
    private String university;
    private int yearOfStudy;

    public Student(String name, String university, int yearOfStudy) {
        this.name = name;
        this.university = university;
        this.yearOfStudy = yearOfStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", university='" + university + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }
}
