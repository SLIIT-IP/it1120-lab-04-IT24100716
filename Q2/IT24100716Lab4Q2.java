import java.util.Scanner;

public class IT24100716Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter the exam marks (out of 100): ");
        int examMarks = scanner.nextInt();

        
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input exam marks.Terminating program.");
            return;
        }

        
        System.out.print("Please enter the lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();

        
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input lab submission marks.Terminating program.");
            return;
        }

        
        System.out.print("Please enter the precentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        System.out.print("Please enter the precentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();

        
        if (examPercentage + labPercentage != 100) {
            System.out.println("The precentages must add up  to 100. Terminating program.");
            return;
        }

        
        double finalMarks = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        

        System.out.println();
        System.out.println();
        System.out.println("Final exam marks: " + finalMarks);

        scanner.close();
    }
}
