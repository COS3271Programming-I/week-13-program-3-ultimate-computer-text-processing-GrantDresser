// oopish.java
// Grant Dresser
// 2/27/2026

import java.util.Scanner;

public class OppishApp {

    public static void run(Scanner input) {
        System.out.println();
        System.out.println("Oppish APP");
        System.out.println("----------");

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char current = sentence.charAt(i);
            System.out.print(current);

            // Check if current letter is a consonant
            if (isConsonant(current)) {

                // If next letter ends consonant group
                if (i == sentence.length() - 1 ||
                    !isConsonant(sentence.charAt(i + 1))) {

                    System.out.print("opp");
                }
            }
        }

        System.out.println();
    }

    // Check consonant
    public static boolean isConsonant(char c) {
        return Character.isLetter(c) &&
               "aeiouy".indexOf(c) == -1;
    }
}