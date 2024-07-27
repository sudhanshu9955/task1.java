import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            Random random = new Random();
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            final int maxAttempts = 5;
            boolean guessedCorrectly = false;
            System.out.println("Welcome to the number Game");
            System.out.println("\nI have generated a number between 1 and 100. Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine();
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("Thank you for playing! Goodbye!");
        scanner.close();
    }
}

