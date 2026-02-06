package differenceObjectsClasses;

public class Student {

    private String name;
    private int credits;

    private static int studentCount = 0;

    public Student(String name, int credits) {
        this.name = name;
        this.credits = credits;
        studentCount++;
    }

    public void addCredits(int amount) {
        if (amount > 0) {
            credits += amount;
        }
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String describe() {
        return "Student{name='" + name + "', credits=" + credits + "}";
    }
}
