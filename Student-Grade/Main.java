import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);

        System.out.print("How many students? ");
        int numberOfStudents = inputCollector .nextInt();

        System.out.print("How many subjects? ");
        int numberOfSubjects = inputCollector.nextInt();

        int totalClassScore = 0;
        int highestScore = 0;
        int lowestScore = 100;

        for (int studentNumber = 1; studentNumber <= numberOfStudents; studentNumber++) {
            System.out.println("\n--- Student " + studentNumber + " ---");
            int totalStudentScore = 0;

            for (int subjectNumber = 1; subjectNumber <= numberOfSubjects; subjectNumber++) {
                int currentScore;

                System.out.print("Subject " + subjectNumber + " 0-100: ");
                currentScore = inputCollector.nextInt();

                while (currentScore < 0 || currentScore > 100) {
                    System.out.println("Invalid! Score must be between 0 and 100");
                    System.out.print("Subject " + subjectNumber + " 0 - 100: ");
                    currentScore = inputCollector.nextInt();
                }

                totalStudentScore = totalStudentScore + currentScore;

                if (currentScore > highestScore) {
                    highestScore = currentScore;
                }

                if (currentScore < lowestScore) {
                    lowestScore = currentScore;
                }
            }

            double studentAverage = (double) totalStudentScore / numberOfSubjects;
            System.out.println("Total: " + totalStudentScore);
            System.out.println("Average: " + studentAverage);

            totalClassScore = totalClassScore + totalStudentScore;
        }

        double classAverage = (double) totalClassScore / (numberOfStudents * numberOfSubjects);

        System.out.println("\n======= FINAL SUMMARY =======");
        System.out.println("Class Total: " + totalClassScore);
        System.out.println("Class Average: " + classAverage);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }
}
