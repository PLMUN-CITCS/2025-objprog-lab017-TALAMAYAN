import java.util.Scanner;

public class GradeCalculator {  // Changed class name from GradeCalculator to Main

    // Method to get the student's score from the user
    public static double getStudentScore(Scanner scanner) {
        double score = -1;

        while (score < 0 || score > 100) {
            System.out.print("Enter your score: ");

            // Validate input
            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                if (score < 0 || score > 100) {
                    System.out.println("Please enter a valid score between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        return score;
    }

    // Method to calculate grade based on score
    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Keep Scanner open
        double score = getStudentScore(scanner);
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
        scanner.close();  // Close Scanner at the end
    }
}
