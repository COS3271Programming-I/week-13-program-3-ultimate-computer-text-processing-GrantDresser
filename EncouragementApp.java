import java.util.Scanner;

public class EncouragementApp {
    public static void run(Scanner input) {

        // Ask for user's name in 3 separate variables
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        // Displays encouraging messages with Unicode characters with use of each name variable
        System.out.println();
        System.out.println("\u2728 YOU GOT THIS, " + firstName + " " + middleName + " " + lastName + " !! \u2728");
        System.out.println("The only way to do great work is to love what you do. \u2764");
        System.out.println("I believe in you.");
    }
}