import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to  Number Guess Game!");

        int score = 0;
        boolean Againplay= true;

        while (Againplay) {
            int targetNumber = random.nextInt(100) + 1;
            int attempt = 0;
            int maximumAttempts = 5;

            System.out.println("I have selected a number between 1 and 100. Would you guess it?");

            while (attempt < maximumAttempts) {
                System.out.print("what is the number you guessed: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempt++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + attempt+ " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high! ");
                }
            }

            if (attempt >= maximumAttempts) {
                System.out.println("Sorry, you've run out of attempts.  Correct number was " + targetNumber + ".");
            }

            System.out.print("Want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            Againplay = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.println("Game end Your score is: " + score);

        scanner.close();
    }
}