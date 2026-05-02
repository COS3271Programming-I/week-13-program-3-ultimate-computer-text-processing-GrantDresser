import java.util.Scanner;

public class UltimateComputer {
    static Scanner userinput = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        while (choice != 5) {
            System.out.println();
            System.out.println("==================================");
            System.out.println("        ULTIMATE COMPUTER");
            System.out.println("==================================");
            System.out.println("1. Display APP");
            System.out.println("2. Text Art APP");
            System.out.println("3. Encouragement APP");
            System.out.println("4. Oppish APP");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = userinput.nextInt();
            userinput.nextLine();

            if (choice == 1) {
                DisplayApp.run(userinput);
            } else if (choice == 2) {
                TextArtApp.run(userinput);
            } else if (choice == 3) {
                EncouragementApp.run(userinput);
            } else if (choice == 4) {
                OppishApp.run(userinput);
            } else if (choice == 5) {
                System.out.println("Thank you for using the Ultimate Computer!");
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, 3, 4, or 5.");
            }
        }
    }
}