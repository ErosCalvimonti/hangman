import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) throws Exception {

        // Scanner class for user inputs
        Scanner scanner = new Scanner(System.in);

        // Declarations and asignations
        String secretWord = "development";
        int attempsMaximum = 5;
        int attemps = 0;
        boolean isGuessedWord = false;

        // Arrays
        char[] guessedLetters = new char[secretWord.length()];

        // Iterative control structure
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        // Iterative control structure
        while (!isGuessedWord && attemps < attempsMaximum) {
            System.out.println("Word to be guessed: " + String.valueOf(guessedLetters) + " (" + ""
                    + secretWord.length() + " letters)");
            System.out.println("Please enter a letter");

            // Using a scanner class to request a letter from the user
            char letter = Character.toLowerCase(scanner.next().charAt(0));

            boolean correctWord = false;

            for (int i = 0; i < secretWord.length(); i++) {
                // Conditional control structure
                if (secretWord.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                    correctWord = true;
                }

            }
            if (!correctWord) {
                attemps++;
                System.out.println("Incorrect! You have " + (attempsMaximum - attemps) + " attemps");
            }

            if (String.valueOf(guessedLetters).equals(secretWord)) {
                isGuessedWord = true;
                System.out.println("Congrats!! You have guessed the secret word! " + secretWord);
            }
        }
        if (!isGuessedWord) {
            System.out.println("Sorry! You have lost all your attempts");
        }
        scanner.close();
    }

}
