import java.util.Scanner;
    public class GradeTracker {
        public static void main(String[] args) {
        int[] grades = {88, 72, 95, 64, 81};

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter student number to update (1 to 5): ");
        int studentNum = kb.nextInt();
        System.out.print("Enter new grade: ");
        int newGrade = kb.nextInt();
        grades[studentNum - 1] = newGrade;

        String[] names = {"Alice", "Bob", "Carol", "Dan", "Eve"};
        System.out.println("Grade Tracker loaded.");


        // System.out.println("Number of students: " + names.length);
        // System.out.println(grades);
        System.out.printf("%-8s %5s%n", "Student", "Score");
        System.out.println("=============");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-8s %3d%n", names[i], grades[i]);
        }

        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        double average = (double) sum / grades.length;
        System.out.println("=============");
        System.out.printf("%-8s %5.1f%n", "Average", average);

        int max = grades[0];
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                }
                if (grades[i] < min) {
                min = grades[i];
                }
            }
        System.out.printf("Highest: %d%n", max);
        System.out.printf("Lowest: %d%n", min);

        System.out.println("\nLetter Grades:");
        System.out.printf("%-8s %5s%n", "Student", "Grade");
        System.out.println("=============");

        for (int i = 0; i < grades.length; i++) {
            char letter;

            if (grades[i] >= 90) {
                letter = 'A';
            } else if (grades[i] >= 80) {
                letter = 'B';
            } else if (grades[i] >= 70) {
                letter = 'C';
            } else if (grades[i] >= 60) {
                letter = 'D';
            } else {
                letter = 'F';
            }

            System.out.printf("%-8s %5c%n", names[i], letter); }
    }
}