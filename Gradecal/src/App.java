import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        // Initialize variables for total score and final grade
        double totalScore = 0;

        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Enter the score for Subject " + i + ": ");
            double subjectScore = scanner.nextDouble();

            if (subjectScore < 0 || subjectScore > 100) {
                System.out.println("Invalid score. Please enter a score between 0 and 100.");
                i--;
            } else {
                totalScore += subjectScore;
            }
        }

        double averageScore = totalScore / numOfSubjects;

        char finalGrade;
        String message;

        if (averageScore >= 90) {
            finalGrade = 'A';
            message = "Pass - Excellent";
        } else if (averageScore >= 80) {
            finalGrade = 'B';
            message = "Pass - Good";
        } else if (averageScore >= 70) {
            finalGrade = 'C';
            message = "Pass - Satisfactory";
        } else if (averageScore >= 60) {
            finalGrade = 'D';
            message = "Pass - Minimum Passing";
        } else {
            finalGrade = 'F';
            message = "Fail - Below Passing";
        }

        System.out.println("\nFinal Grade: " + finalGrade);
        System.out.println("Message: " + message);
        scanner.close();
    }
}
