package differenceObjectsClasses;

public class Main {

    public static void main(String[] args) {

        System.out.println("Students created so far (class-level): " + Student.getStudentCount());

        Student s1 = new Student("Brianna", 12);
        Student s2 = new Student("Jordan", 30);

        System.out.println("\n--- Object State (Different Values) ---");
        System.out.println("s1: " + s1.describe());
        System.out.println("s2: " + s2.describe());

        s1.addCredits(3);

        System.out.println("\n--- After modifying s1 only ---");
        System.out.println("s1: " + s1.describe());
        System.out.println("s2: " + s2.describe());

        System.out.println("\n--- Class-level Shared Info (Static) ---");
        System.out.println("Total Student objects created: " + Student.getStudentCount());

        System.out.println("\n--- Concept Summary ---");
        System.out.println("A class is a blueprint (Student).");
        System.out.println("Objects are instances created from the class (s1, s2).");
        System.out.println("Objects have their own state (name/credits), but share the same behavior (methods).");
        System.out.println("Static members belong to the class, not any one object.");
    }
}
