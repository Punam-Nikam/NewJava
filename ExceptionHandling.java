import java.util.Scanner;

// Step 1: Custom Exception Class
class InvalidAgeException extends Exception
 {
    public InvalidAgeException(String message) {
        super(message);
    }
}
// Step 2: Main class
public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }
}