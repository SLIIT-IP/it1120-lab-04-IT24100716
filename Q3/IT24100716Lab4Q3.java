import java.util.Scanner;

public class IT24100716Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        String outnb = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

        System.out.println("The number is " + outnb);

        scanner.close();
    }
}
