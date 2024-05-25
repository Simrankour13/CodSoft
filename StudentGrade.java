import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks obtained in English:");
        int englishMarks = scanner.nextInt();

        System.out.println("Enter marks obtained in Math:");
        int mathMarks = scanner.nextInt();

        System.out.println("Enter marks obtained in Science:");
        int scienceMarks = scanner.nextInt();

        scanner.close();

        double totalMarks = englishMarks + mathMarks + scienceMarks;
        double percentage = (totalMarks / 300) * 100;
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
